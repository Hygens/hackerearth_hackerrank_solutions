#include <stdio.h>
int gcd(int m, int n)
{
    if(m == n) return m;
    else if(m < n) return gcd(n - m, m);
    else return gcd(m - n, n);
}
//int main(void)
//{
//	int max=0,k=0,m=0,n=0,count=0,T=0;
//	scanf("%d",&T);
//	while (T>0) {
//		scanf("%d",&max);
//		count=0;
//		for(m = 1; m < max; ++m) {
//			for(n = m+1; n < max; n += 2)
//				if(gcd(m, n) == 1)
//					for(k = 1; (n*n + m*m)*k <= max; k++)
//						count++;
//		}
//        printf("%d\n",count);
//        T--;
//	}
//    return 0;
//}
//if ((n*n + m*m)*k<=max)

//		for (j = 1; j < N+1; j+=2) {
//			for (k =j+1; k < N+1; k++) {
//				for (l=k+1; l < N+1; l++) {
//					ptrip = j * j + k * k;
//					hyp = l * l;
//					if (ptrip == hyp) {
//						count++;
//					}
//				}
//			}
//		}
