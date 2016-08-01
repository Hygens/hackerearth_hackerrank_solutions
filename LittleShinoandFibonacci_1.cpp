#include <iostream>
#include <math.h>
using namespace std;
long double powBig(long double base, long exp) {
    if (exp == 0) return 0;
    if (exp ==1) return base;
    if (exp % 2 == 0) {
        long double half = powBig(base, exp/2);
        return half*half;
    } else {
        long double half = powBig(base, (exp-1)/2);
        return base * half * half;
    }
}

long double fibSum(long n) {
    if (n == 0 || n == 1)  return 0;
    else if (n == 2)  return 1;
    else {
        n++;
        double a = sqrt(5); double b = 1+a; double c = 1-a;
        long double e = (powBig(b,n)-powBig(c,n))/(powBig(2,n)*a);
        return e - 1;
    }
}

//int main() {
//	int n;
//	long r, l;
//	cin >> n;
//	while (n>0) {
//		cin >> l >> r;
//		long double s1 = fibSum(l-1);
//		long double s2 = fibSum(r);
//		long double s = fmod(s2-s1,10000);
//		cout << fmod(s,1000000007) << endl;
//		n--;
//	}
//	return 0;
//}
