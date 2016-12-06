#include <stdio.h>
#include <stdlib.h>
//int main(void) {
//	int n, q, Q, R, L, X, i; int* A; int* tmp;
//	scanf("%d %d", &n, &q);
//	A = (int*)malloc((n+1)*sizeof(int));
//	i = 0;
//	while (i<n && scanf("%d", &A[i++])==1);
//	for(int y=0; y<q; y++) {
//		scanf("%d",&Q);
//		if (Q==0) {
//			scanf("%d %d",&L,&R);
//			tmp = (int*)malloc((R-L+1)*sizeof(int));
//			for(int k=L-1;k<R;k++) *(tmp+k)=*(A+k);
//			if (tmp[R-1]==0) printf("%s\n","EVEN");
//			else printf("%s\n","ODD");
//			tmp = NULL;
//		} else if (Q==1){
//			scanf("%d",&X);
//			A[X-1]= !A[X-1];
//		}
//	}
//	free(A);
//	return 0;
//}
