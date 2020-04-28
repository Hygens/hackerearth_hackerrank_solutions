#include <stdio.h>
#include <math.h>
using namespace std;
int gcd(int a, int b)
{
	return b ? gcd(b, a%b) : a;
}
bool isPrime (int num)
{
   if (num==1) return false;
   else
	   return gcd(num,2)==1 || gcd(num,3)==1 || gcd(num,5)==1 || gcd(num,7)==1;

}
int main() {
	int t,x,y; long s;
	scanf("%d",&t);
	while (t>0) {
		scanf("%d %d",&x,&y);
		s=0;
		for(int i=x;i<=y;i++)
			if (isPrime(i)) s+=i;
		printf("%ld\n",s);
		t--;
	}
}
