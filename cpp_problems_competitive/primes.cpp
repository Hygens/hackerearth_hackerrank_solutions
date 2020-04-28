#include <stdio.h>
#include <math.h>
bool is_Prime(int n)
 {
   int square_root = sqrt(n);
   int toggle = 1;
   for(int i = 2; i <= square_root; i++)
   {
     if(n%i==0)
     {
        toggle = 0;
        break;
     }
   }
   if(toggle)
     return true;
   else
     return false;
}
//int main() {
//	int T,N;
//	scanf("%d %d",&T);
//	while (T-->0) {
//		scanf("%d",&N);
//		if (is_Prime(N)) printf("%s","IS_PRIME");
//		else printf("%s","NO_PRIME");
//	}
//}
