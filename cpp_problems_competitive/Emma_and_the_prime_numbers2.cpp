#include <cmath>
#include <limits>
#include <cmath>
#include <stdio.h>

using namespace std;

long prime_number_sequence( int lbound, int ubound )
{
		int *arr = new int[ubound-lbound];

	    for (int i = lbound; i < ubound; i++)
	    {
	        for (int j = i * i; j < ubound; j+=i)
	        {
	            arr[j - 1] = 1;
	        }
	    }
	    for (int i = lbound; i <= ubound; i++)
	    {
	        if (arr[i - 1] == 0)
	            printf("%d\n",i);
	    }
}
int main() {
	int t,x,y;
	scanf("%d",&t);
	while (t>0) {
		scanf("%d %d",&x,&y);
		prime_number_sequence(x,y);
//		printf("%ld\n",primesupto(x,y));
		t--;
	}
}
