#include <iostream>
using namespace std;
long comb(long v[], int size, long weight) {
	long** arr = new long*[size+1]();
	for (int i = 0; i <= size; i++) {
		arr[i] = new long[weight+1];
		arr[i][0] = 1;
	}
	for (long i = 1; i <= weight; i++) {
		arr[0][i] = 0;
	}
	for (int i = 1; i <= size; i++) {
		for(long j=1; j <= weight; j++) {
			if (v[i - 1] <= j) {
				arr[i][j] = arr[i - 1][j] + arr[i][j - v[i - 1]];
			} else {
				arr[i][j] = arr[i - 1][j];
			}
		}
	}
	return arr[size][weight];
}
//int main() {
//	int n,q; long Q;
//	cin >> n >> q;
//	long* a = new long[n];
//	for (int i = 0; i < n; i++) {
//		cin >> a[i];
//	}
//	while (q-->0) {
//		cin >> Q;
//		long long count = comb(a, n, Q);
//		if (count>0)
//			cout << "YES" << "\n";
//		else
//			cout << "NO" << "\n";
//	}
//	return 0;
//}
