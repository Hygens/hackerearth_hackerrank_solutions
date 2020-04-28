//#include <time.h>
//#include <math.h>
//#include <stdio.h>
//#include <stddef.h>
//#include <string.h>
//#include <stdlib.h>
//#include <stdbool.h>
//
//#define v(expr) ((expr) % base)
//
//int main(int argc, char *argv[]){
//    long long n, k;
//    scanf("%lld", &n);
//    scanf("%lld", &k);
//    long long base = 1000000007;
//    long long *nums = (long long *)malloc(n * sizeof(long long));
//    long long k2 = v(k * k);
//    for(long long i = 0; i < n; i++){
//        scanf("%lld", &nums[i]);
//    }
//    long long sum0 = 0, sum1 = 0, sum2 = 0;
//    for(long long i = 0; i < k; i++){
//        sum0 = v(sum0 + nums[i]);
//        sum1 = v(sum1 + v((i + 1) * nums[i]));
//        sum2 = v(sum2 + v(v((i + 1) * (i + 1)) * nums[i]));
//    }
//    printf("%lld%s", sum2, k == n ? "\n" : " ");
//    for(long long i = 1; i <= n - k; i++){
//        sum2 = v(sum2 - 2 * sum1 + sum0 + v(k2 * nums[i + k - 1]));
//        sum1 = v(sum1 - sum0 + v(k * nums[i + k - 1]));
//        sum0 = v(sum0 - nums[i - 1] + nums[i + k - 1]);
//        if(sum0 < 0){
//            sum0 += base;
//        }
//        if(sum1 < 0){
//            sum1 += base;
//        }
//        if(sum2 < 0){
//            sum2 += base;
//        }
//        printf("%lld%s", sum2, i == n - k ? "\n" : " ");
//    }
//    return 0;
//}
