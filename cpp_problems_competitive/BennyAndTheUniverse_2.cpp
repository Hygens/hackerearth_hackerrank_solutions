#include <iostream>
#include<bits/stdc++.h>
using namespace std;
long comb3(int coins[], int m, int V)
{
	int *table = new int[V+1];
    table[0] = 0;
    for (int i=1; i<=V; i++)
           table[i] = INT_MAX;
    for (int i=1; i<=V; i++)
    {
        for (int j=0; j<m; j++)
          if (coins[j] <= i)
          {
              long sub_res = table[i-coins[j]];
              if (sub_res != INT_MAX && sub_res + 1 < table[i])
                  table[i] = sub_res + 1;
          }
    }
    return table[V];
}
//int main() {
//	int n,q; int Q;
//	cin >> n >> q;
//	int* a = new int[n];
//	for (int i = 0; i < n; i++) {
//		cin >> a[i];
//	}
//	while (q-->0) {
//		cin >> Q;
//		int count = comb3(a, n, Q);
//		if (count>0 and count<INT_MAX) {
//			cout << "YES" << endl;
//		} else {
//			cout << "NO" << endl;
//		}
//	}
//	return 0;
//}
