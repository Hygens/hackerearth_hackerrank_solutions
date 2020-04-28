#include <iostream>
using namespace std;

int main() {
	long N; long count=0;
	int A=0; int B=0;
	scanf("%ld %d %d",&N,&A,&B);
	if (A==1 || B==1) count=N;
	else {
		int init=A<B?A:B;
		for(int i=init;i<=N;i++)
			if(i%A==0 || i%B==0) count++;
	}
	printf("%ld\n",count);
	return 0;
}
