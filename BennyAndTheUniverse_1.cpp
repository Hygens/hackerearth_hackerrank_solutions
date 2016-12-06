//#include <iostream>
//#include <math.h>
//#include <string.h>
//using namespace std;
//long comb2(long S[], int m, long n )
//{
//	long *table = new long[n+1];
//	memset(table, 0, (n+1)*sizeof(long));
//	table[0] = 1;
//	for(int i=0; i<m; i++)
//		for(long j=S[i]; j<=n; j++)
//			table[j] += table[j-S[i]];
//	return table[n];
//}
//int main() {
//	int n,q; long Q;
//	cin >> n >> q;
//	long* a = new long[n];
//	for (int i = 0; i < n; i++) {
//		cin >> a[i];
//	}
//	while (q-->0) {
//		cin >> Q;
//		long count = comb2(a, n, Q);
//		if (count>0)
//			cout << "YES" << "\n";
//		else
//			cout << "NO" << "\n";
//	}
//	return 0;
//}
