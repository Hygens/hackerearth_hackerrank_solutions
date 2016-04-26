#include <stdio.h>
#include <math.h>
int divisors(int x) {
    int limit = x;
    int numberOfDivisors = 0;
    if (x == 1) return 1;
    for (int i = 1; i < limit; ++i) {
        if (x % i == 0) {
            limit = x / i;
            if (limit != i) {
                numberOfDivisors++;
            }
            numberOfDivisors++;
        }
    }
    return numberOfDivisors;
}
int main() {
	long L,R; int T,count;
	scanf("%d",&T);
	while (T-->0) {
		scanf("%ld %ld",&L,&R);
		count=0;
		for(int i=L;i<=R;i++)
			if (i==1) count++;
			else if(divisors(i)%2!=0) count++;
		printf("%d\n",count);
	}
	return 0;
}
