//#include<iostream>
//#include<cstring>
//using namespace std;
//int H[50000], C[50000];
//const int maxn = 50010;
//const int mod = 1000000007;
//class FTree
//{
//private:
//	long long tree[maxn];
//
//public:
//	FTree()
//	{
//		memset(tree, 0, sizeof(tree));
//	}
//
//	long long get(int idx)
//	{
//		return query(idx) - query(idx - 1);
//	}
//
//	void set(int idx, long long val)
//	{
//		long long curr = get(idx);
//		update(idx, val - curr);
//	}
//
//	void update(int idx, long long val)
//	{
//		while (idx <= maxn)
//		{
//			tree[idx] = (tree[idx] + val) % mod;
//			idx += (idx & -idx);
//		}
//	}
//
//	long long query(int idx)
//	{
//		long long sum = 0;
//		while (idx > 0)
//		{
//			sum = (sum + tree[idx]) % mod;
//			idx -= (idx & -idx);
//		}
//		return sum;
//	}
//};
//FTree tree[128];
//int main()
//{
//	int n, k;
//	cin >> n >> k;
//	tree[0].update(1, 1);
//	for (int i = 0; i < n; i++)
//	{
//		cin >> H[i] >> C[i];
//		H[i]++;  C[i]--;
//		for (int j = 0; j < (1 << k); j++)
//		{
//			long long v = tree[j].query(H[i] - 1);
//			tree[j | (1 << C[i])].update(H[i], v);
//		}
//	}
//	cout << tree[(1 << k) - 1].query(50001) << endl;
//	return 0;
//}
