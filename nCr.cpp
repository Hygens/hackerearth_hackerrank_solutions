#include <iostream>
#include <vector>
#include <algorithm>
#include <cstdio>
using namespace std;
typedef vector<int> VI;
typedef pair<int,int> PII;
vector<VI> facts1;
vector<VI> facts2;
vector<PII> factors;
void print_vector(VI v) {
    for (int i = 0; i < v.size(); ++i) {
	printf(" %d", v[i]);
    }
    printf("\n");
}
int MOD(int a, int b) {
    return ((a%b)+b)%b;
}
int GCD(int a, int b) {
    int tmp;
    while(b){a%=b; tmp=a; a=b; b=tmp;}
    return a;
}
int LCM(int a, int b) {
    return a/GCD(a,b)*b;
}
int extended_euclid(int a, int b, int &x, int &y) {
    int xx = y = 0;
    int yy = x = 1;
    while (b) {
	int q = a/b;
	int t = b; b = a%b; a = t;
	t = xx; xx = x-q*xx; x = t;
	t = yy; yy = y-q*yy; y = t;
    }
    return a;
}
VI modular_linear_equation_solver(int a, int b, int n) {
    int x, y;
    VI solutions;
    int d = extended_euclid(a, n, x, y);
    if (!(b%d)) {
	x = MOD (x*(b/d), n);
	for (int i = 0; i < d; i++)
	    solutions.push_back(MOD(x + i*(n/d), n));
    }
    return solutions;
}
int mod_inverse(int a, int n) {
    int x, y;
    int d = extended_euclid(a, n, x, y);
    if (d > 1) return -1;
    return MOD(x,n);
}
PII chinese_remainder_theorem(int x, int a, int y, int b) {
    int s, t;
    int d = extended_euclid(x, y, s, t);
    if (a%d != b%d) return make_pair(0, -1);
    return make_pair(MOD(s*b*x+t*a*y,x*y)/d, x*y/d);
}
PII chinese_remainder_theorem(const VI &x, const VI &a) {
    PII ret = make_pair(a[0], x[0]);
    for (int i = 1; i < x.size(); i++) {
	ret = chinese_remainder_theorem(ret.second, ret.first, x[i], a[i]);
	if (ret.second == -1) break;
    }
    return ret;
}
void linear_diophantine(int a, int b, int c, int &x, int &y) {
    int d = GCD(a,b);
    if (c%d) {
	x = y = -1;
    } else {
	x = c/d * mod_inverse(a/d, b/d);
	y = (c-a*x)/b;
    }
}
int power_mod(int a, int b, int m) {
    if (b == 0) {
	return 1;
    } else if (b == 1) {
	return a % m;
    } else {
	int tmp = power_mod(a, b >> 1, m);
	if (b % 2 == 0) {
	    return tmp * tmp % m;
	} else {
	    return tmp * tmp * a % m;
	}
    }
}
PII fact_mod(int n, int p, const VI& facts) {
    if (n == 0) return make_pair(1, 0);
    PII tmp = fact_mod(n / p, p, facts);
    int a = tmp.first;
    int e = tmp.second;
    e += n / p;
    if (n / p % 2 != 0) return make_pair(a * (p - facts[n % p]) %p, e);
    else return make_pair(a * facts[n % p] % p, e);
}
int n_fact_fact(int n, int m, int p, const VI& facts) {
    if (n == 0 || n == 1) {
	return 1;
    } else if (n < m) {
	return facts[n] * n_fact_fact(n / p, m, p, facts) % m;
    } else {
	int a = facts[m - 1];
	int b = facts[n % m];
	int c = n_fact_fact(n / p, m, p, facts);
	return power_mod(a, n / m, m) * b * c % m;
    }
}
int power(int a, int i) {
    if (i == 0) {
	return 1;
    } else if (i == 1) {
	return a;
    } else {
	int tmp = power(a, i >> 1);
	if (i % 2 == 0) return tmp * tmp;
	else return tmp * tmp * a;
    }
}
int comb_mod2(int n, int r, int m, PII pa, const VI facts, const VI& tmp) {
    int p, a;
    p = pa.first; a = pa.second;
    int b = a;
    while (b > 0) {
	PII t1 = fact_mod(n, p, tmp);
	PII t2 = fact_mod(r, p, tmp);
	PII t3 = fact_mod(n - r, p, tmp);
	int e1, e2, e3;
	e1 = t1.second; e2 = t2.second; e3 = t3.second;
	if (e1 >= e2 + e3 + a) return 0;
	if (e1 >= e2 + e3 + b) break;
	b = b - 1;
    }
    int m1 = n_fact_fact(n, m, p, facts);
    int m2 = n_fact_fact(r, m, p ,facts);
    int m3 = n_fact_fact(n - r, m, p, facts);
    return power(p, b) * m1 * mod_inverse(m2, m) * \
	mod_inverse(m3, m) % m;
}
int solve(int n, int r) {
    VI xs(4, 0);
    VI as(4, 0);
    for (int i = 0; i < factors.size(); ++i) {
	xs[i] = power(factors[i].first, factors[i].second);
	as[i] = comb_mod2(n, r, xs[i], factors[i], facts1[i], facts2[i]);
    }
    return chinese_remainder_theorem(xs, as).first;
}
VI gen_fact(int m) {
    VI ret(m, 1);
    ret.push_back(1);
    for (int i = 1; i < m; ++i) {
	if (GCD(i, m) == 1) ret[i] = ret[i - 1] * i % m;
	else ret[i] = ret[i - 1];
    }
    return ret;
}
//void init() {
//    factors.push_back(make_pair(3, 3));
//    factors.push_back(make_pair(11, 1));
//    factors.push_back(make_pair(13, 1));
//    factors.push_back(make_pair(37, 1));
//    for(int i = 0; i < 4; ++i) {
//	int p = factors[i].first;
//	int a = factors[i].second;
//	facts1.push_back(gen_fact(power(p, a)));
//	facts2.push_back(gen_fact(p));
//    }
//}
//int main() {
//    int T, n, r;
//    init();
//    scanf("%d", &T);
//    for (int i = 0; i < T; ++i) {
//	scanf("%d%d", &n, &r);
//	printf("%d\n", solve(n, r));
//    }
//}
