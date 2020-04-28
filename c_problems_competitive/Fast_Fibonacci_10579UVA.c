#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

char* toBinaryString(int num)
{
  int bitStrLen = sizeof(char);
  char* p = (char*)malloc(bitStrLen);
  int i = 0;
  while(num >>= 1)
  {
    int k = 1 & num;
    bitStrLen += sizeof(char);
    realloc(p,bitStrLen);
    *(p + i++) = ((k == 1) ? '1' : '0');
  }
  return p;
}

unsigned long long fib(int k, int m) {
	char* rec = toBinaryString(k);
	printf("%s\n",rec);
	unsigned long long v1=1, v2=1, v3=0, calc, tmpv1, tmpv2, tmpv3;
    for(int j=strlen(rec)-2; j>=0; j--){
        calc = v2*v2;
        tmpv1 = v1; v1 = ((v1*v1)+calc)%m;
        tmpv2 = v2; v2 = ((tmpv1+v3)*tmpv2)%m;
        tmpv3 = v3; v3 = (calc+(tmpv3*tmpv3))%m;
        if (rec[j]=='1')  {
        	tmpv1= v1; v1 = v1+v2;
        	tmpv2= v2; v2 = tmpv1;
        	v3 = tmpv2;
        }
    }
    return v2;
}

int main(void) {
	printf("%llu\n",fib(11,pow(2,7)));
	printf("%llu\n",fib(11,pow(2,6)));
	printf("%llu\n",fib(100,pow(2,13)));
	printf("%llu\n",fib(299,pow(2,7)));
	return 0;
}
