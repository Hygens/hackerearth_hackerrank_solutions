#include <iostream>
#include <math.h>
#include <iomanip>
using namespace std;
long long comb(int v[], long size, long long min, long long weight) {
	long long** arr = new long long*[size+1]();
	for (int i = 0; i <= size; i++) {
		arr[i] = new long long[weight+1];
		arr[i][0] = 1;
	}
	for (long long i = 1; i <= weight; i++) {
		arr[0][i] = 0;
	}
	double sum = 0.0;
	for (int i = 1; i <= size; i++) {
		for(long long j=1; j <= weight; j++) {
			if (v[i - 1] <= j) {
				arr[i][j] = arr[i - 1][j] + arr[i][j - v[i - 1]];
			} else {
				arr[i][j] = arr[i - 1][j];
			}
			if (j>=min) sum+=arr[size][j];
		}
	}
	return sum;
}
//int main() {
//	int n;
//	long long r, l;
//	cin >> n;
//	int* a = new int[n];
//	for (int i = 0; i < n; i++) {
//		cin >> a[i];
//	}
//	cin >> l >> r;
//	cout << setprecision(0) << fixed << fmod(comb(a, n, l, r),1000000007.0) << "\n";
//	return 0;
//}
