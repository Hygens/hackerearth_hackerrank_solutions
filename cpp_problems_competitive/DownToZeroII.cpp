//#include <cmath>
//#include <cstring>
//#include <cstdio>
//#include <vector>
//#include <queue>
//#include <iostream>
//#include <algorithm>
//using namespace std;
//const int ln = 1001010;
//bool v[ln];
//int n;
//void start(){
//    memset(v, 0, sizeof(v));
//}
//
//void calcule(pair<int,int> &c, queue<pair<int,int>> &q){
//    int m = c.first;
//    for(int i = 2; i <= sqrt(m); ++ i){
//        if(m%i == 0){
//            int nt = max(i, m/i);
//            if(!v[nt]){
//                v[nt] = 1;
//                q.push(make_pair(nt, c.second + 1));
//            }
//        }
//    }
//    if(m && !v[m - 1]){
//        v[m - 1] = 1;
//        q.push(make_pair(m - 1, c.second + 1));
//    }
//}
//
//int main() {
//    int T;
//    scanf("%d",&T);
//    while(T --){
//        scanf("%d",&n);
//        start();
//        queue<pair<int,int>> q;
//        int ans = 0;
//        q.push(make_pair(n, 0));
//        while(!q.empty()){
//            pair<int,int> cur = q.front();
//            q.pop();
//            if(cur.first == 0){
//                ans = cur.second;
//                break;
//            }
//            calcule(cur, q);
//        }
//        printf("%d\n",ans);
//    }
//    return 0;
//}
