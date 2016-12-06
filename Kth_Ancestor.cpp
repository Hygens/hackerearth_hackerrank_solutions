//#include <cstdio>
//#include <set>
//using namespace std;
//
//#define FOR(i, a, b) for (int i = (a); i < (b); i++)
//#define REP(i, n) for (int i = 0; i < (n); i++)
//
//int ri()
//{
//  int x;
//  scanf("%d", &x);
//  return x;
//}
//
//const int N = 100001, LOGN = 17;
//int jp[LOGN][N];
//
//int main()
//{
//  for (int cc = ri(); cc--; ) {
//    set<int> vs;
//    int n = ri();
//    REP(i, n) {
//      int v = ri(), u = ri();
//      jp[0][v] = u;
//      vs.insert(v);
//    }
//    FOR(k, 1, LOGN)
//      for (auto y: vs)
//        jp[k][y] = jp[k-1][y] ? jp[k-1][jp[k-1][y]] : 0;
//
//    for (n = ri(); n--; ) {
//      int op = ri(), x = ri();
//      if (op == 0) {
//        int y = ri();
//        jp[0][y] = x;
//        FOR(k, 1, LOGN)
//          jp[k][y] = jp[k-1][y] ? jp[k-1][jp[k-1][y]] : 0;
//        vs.insert(y);
//      } else if (op == 1) {
//        REP(k, LOGN)
//          jp[k][x] = 0;
//        vs.erase(x);
//      } else if (op == 2) {
//        int y = ri();
//        while (y) {
//          int k = 31-__builtin_clz(y);
//          y -= 1 << k;
//          x = jp[k][x];
//        }
//        printf("%d\n", x);
//      }
//    }
//    REP(k, LOGN)
//      for (auto y: vs)
//        jp[k][y] = 0;
//  }
//}
