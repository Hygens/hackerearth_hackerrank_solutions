#include <iostream>
#include <vector>
#include <string>
#include <math.h>
#include <stdlib.h>

using namespace std;

const int max_a = 100;
const double epsilon = 1e-8;
const double max_value = 3.4e+8;
const double log_max_value = log(max_value);

enum RESULT { LESS, GREATER, TOP_LESS, TOP_GREATER, TOP_EQUAL, NONE };

bool is_prime(int n) {
	for (int i = 2; i * i <= n; i++)
		if (n % i == 0)
			return false;
	return true;
}

// decomposes n into prime factors
vector <int> factor(int n) {
	vector <int> result;
	for (int k = 2; k <= max_a; k++)
		if (is_prime(k)) {
			int count = 0;
			while (n % k == 0) {
				n /= k;
				count++;
			}
			result.push_back(count);
		}
	return result;
}

// returns the value of tower a
double evaluate_double(const vector <int> &a) {
	double result = 1.0;
	// check for overflow is necessary!!!
	for (int i = a.size() - 1; i >= 0; i--)
		result = pow(a[i], result);
	return result;
}

// returns the value of tower a
int evaluate_int(const vector <int> &a) {
	int result = 1;
	// check for overflow is necessary!!!
	for (int i = a.size() - 1; i >= 0; i--) {
		int new_result = 1;
		for (int j = 0; j < result; j++)
			new_result *= a[i];
		result = new_result;
	}
	return result;
}

// returns the logarithm of tower a
double evaluate_log(const vector <int> &a) {
	if (a.size() == 0)
		return 0.0;
	else {
		vector <int> new_a(++a.begin(), a.end());
		return log((double)a[0]) * evaluate_double(new_a);
	}
}

int gcd(int a, int b) {
	return b == 0 ? a : gcd(b, a % b);
}

// compares real number to a tower
// x >= 1.0
bool is_less(double x, const vector <int> &a) {
	for (int i = 0; i < a.size(); i++) {
		x = log(x) / log((double)a[i]);
		if (x < 1)
			return true;
	}
	return false;
}

// returns true if a * p == b * q
// a, b - towers
// p, q >= 1
bool is_equal(const vector <int> &a, int p, const vector <int> &b, int q) {
	if (a.size() == 0 && b.size() == 0)
		return p == q;
	else if (a.size() == 0)
		// a == 1
		// p >= b && p == b * q
		// multiply p by 2 to avoid rounding problems
		return !is_less(2 * p, b) && p == evaluate_int(b) * q;
	else if (b.size() == 0)
		// b == 1
		// q >= a && q == a * p
		// multiply q by 2 to avoid rounding problems
		return !is_less(2 * q, a) && q == evaluate_int(a) * p;
	vector <int> f_p = factor(p);
	vector <int> f_a = factor(a[0]);
	vector <int> f_q = factor(q);
	vector <int> f_b = factor(b[0]);
	vector <int> new_a(a.begin() + 1, a.end());
	vector <int> new_b(b.begin() + 1, b.end());
	int c = -1, d = -1;
	// check each prime factor
	for (int i = 0; i < f_p.size(); i++) {
		if (f_p[i] != f_q[i]) {
			int value_a = evaluate_int(new_a);
			int value_b = evaluate_int(new_b);
			// check for overflow!!!
			if (f_a[i] * value_a + f_p[i] != f_b[i] * value_b + f_q[i])
				return false;
		}
		else if ((f_a[i] == 0) != (f_b[i] == 0))
			return false;
		else if (f_a[i] != 0 && f_b[i] != 0) {
			// f_a[i] >= 1, f_b[i] >= 1
			int g = gcd(f_a[i], f_b[i]);
			int new_c = f_a[i] / g;
			int new_d = f_b[i] / g;
			if (c == -1 && d == -1) {
				c = new_c;
				d = new_d;
			}
			else if (c != new_c || d != new_d)
				return false;
		}
	}
	if (c == -1 && d == -1)
		return true;
	else
		return is_equal(new_a, c, new_b, d);
}

// a.size(), b.size() >= 1
// returns LESS if the whole tower a is less than b
// returns GREATER if the whole tower a is greater than b
// returns TOP_LESS if the top part of tower a is less than the top part of tower b
// returns TOP_GREATER if the top part of tower a is greater than the top part of tower b
// returns TOP_EQUAL if the top part of tower a equals the top part of tower b
// returns NONE if solution was unable to compare towers
RESULT solve(const vector <int> &a, const vector <int> &b) {
	int x = a[0];
	int y = b[0];
	vector <int> new_a(a.begin() + 1, a.end());
	vector <int> new_b(b.begin() + 1, b.end());
	// consider the case where new_a == new_b
	if (is_equal(new_a, 1, new_b, 1)) {
		if (a[0] > b[0] && is_less(log_max_value, new_a))
			return GREATER;
		else if (a[0] < b[0] && is_less(log_max_value, new_a))
			return LESS;
		else if (a[0] > b[0])
			return TOP_GREATER;
		else if (a[0] < b[0])
			return TOP_LESS;
		else
			return TOP_EQUAL;
	}
	else {
		double log_x_a = evaluate_log(new_a) + log(log((double)x));
		double log_y_b = evaluate_log(new_b) + log(log((double)y));
		double d = log_x_a - log_y_b;
		// check if there are all cases!!!
		if (log_y_b > log_max_value && d > epsilon)
			return GREATER;
		else if (log_x_a > log_max_value && d < -epsilon)
			return LESS;
		else if (is_equal(a, 1, b, 1))
			return TOP_EQUAL;
		else if (abs(d) <= epsilon)
			return NONE;
		else if (d > 0)
			return TOP_GREATER;
		else
			return TOP_LESS;
	}
}

vector <int> read_tower(istream &in) {
	int n;
	in >> n;
	vector <int> result(n);
	for (int i = 0; i < n; i++)
		in >> result[i];

	for (int i = 0; i < result.size(); i++)
		if (result[i] == 1) {
			result.erase(result.begin() + i, result.end());
			break;
		}
	return result;
}

//int main() {
//	vector <int> a = read_tower(cin);
//	vector <int> b = read_tower(cin);
//
//	RESULT ans;
//	if (a.size() >= b.size() + 3)
//		ans = GREATER;
//	else if (b.size() >= a.size() + 3)
//		ans = LESS;
//	else if (a.size() == 0 && b.size() == 0)
//		ans = TOP_EQUAL;
//	else if (a.size() == 0 && b.size() != 0)
//		ans = LESS;
//	else if (b.size() == 0 && a.size() != 0)
//		ans = GREATER;
//	else {
//		for (int i = min(a.size() - 1, b.size() - 1); i >= 0; i--) {
//			vector <int> new_a(a.begin() + i, a.end());
//			vector <int> new_b(b.begin() + i, b.end());
//			ans = solve(new_a, new_b);
//			if (ans == LESS || ans == GREATER || ans == NONE)
//				break;
//		}
//	}
//	if (ans == LESS || ans == TOP_LESS)
//		cout << "Less" << endl;
//	else if (ans == GREATER || ans == TOP_GREATER)
//		cout << "Greater" << endl;
//	else if (ans == TOP_EQUAL)
//		cout << "Equal" << endl;
//	else
//		cout << "Give up!" << endl;
//	return 0;
//}

// Input format:
// n
// a1 a2 ... an
// m
// b1 b2 ... bm
