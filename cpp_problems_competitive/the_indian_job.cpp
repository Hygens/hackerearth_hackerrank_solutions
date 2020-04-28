//#include <cstdio>
//int max(int a, int b) {
//    return (a > b) ? a : b;
//}
//const int MAX_N = 100;
//const int MAX_G = 1000000;
//int B[MAX_N];
//int DP[MAX_N + 1][MAX_G + 1];
//int knapsack(int N, int G) {
//    for(int i = 0; i <= N; i++) {
//        for(int w = 0; w <= G; w++) {
//            if(i == 0 || w == 0)
//                DP[i][w] = 0;
//            else if(B[i - 1] > w)
//                DP[i][w] = DP[i - 1][w];
//            else
//                DP[i][w] = max(DP[i - 1][w], DP[i - 1][w - B[i - 1]] + B[i - 1]);
//        }
//    }
//    return DP[N][G];
//}
//int main(int argc, char* argv[]) {
//    int T, N, G;
//    scanf("%d", &T);
//    while(T--) {
//        scanf("%d %d", &N, &G);
//        int total = 0;
//        for(int i = 0; i < N; i++) {
//            scanf("%d", &B[i]);
//            total += B[i];
//        }
//        if(total > 2 * G)
//            printf("NO\n");
//        else
//            printf((total - knapsack(N, G) <= G) ? "YES\n" : "NO\n");
//    }
//    return 0;
//}
