#include <stdio.h>
unsigned int unscrumbler(unsigned int num)
{
    unsigned int mask;
    for (mask = num >> 1; mask != 1; mask = mask >> 1)
    {
        num = num ^ mask;
    }
    return num;
}
//int main(void) {
//	int t; int scrumbled;
//	scanf("%d",&t);
//	for(int i=0;i<t;i++) {
//		scanf("%d",&scrumbled);
//		printf("%d ",unscrumbler(scrumbled));
//	}
//	return 0;
//}
