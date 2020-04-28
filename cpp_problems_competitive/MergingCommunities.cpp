//#include <iostream>
//using namespace std;
//int size[100005];
//int a[100005];
//int root(int a[], int i) {
//	while (a[i] != i) {
//		i = a[i];
//	}
//	return i;
//}
//void union1(int a[],int size[],int r,int s)
//{
//    int root_r=root(a,r);
//    int root_s=root(a,s);
//
//    if(root_r!=root_s)
//    {
//        if(size[root_r] < size[root_s]){
//            a[root_r]=a[root_s];
//            size[root_s]+=size[root_r];
//        }
//        else {
//            a[root_s]=a[root_r];
//            size[root_r]+=size[root_s];
//
//        }
//    }
//}
////int main() {
////	int n, q;
////	cin >> n >> q;
////	for (int i = 1; i <= n; i++) {
////		a[i] = i;
////		size[i] = 1;
////	}
////	for (int i = 1; i <= q; i++) {
////		char x;
////		cin >> x;
////		if (x == 'Q') {
////			int p;
////			cin >> p;
////			cout<<size[root(a,p)]<<endl;
////		} else if (x == 'M') {
////			int r, s;
////			cin >> r >> s;
////			union1(a, size, r, s);
////		}
////	}
////	return 0;
////}
