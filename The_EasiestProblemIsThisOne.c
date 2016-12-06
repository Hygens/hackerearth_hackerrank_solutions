//#include <stdio.h>
//#include <malloc.h>
//int add(char* chars) {
//	int sum=0;
//	for(int x=0;chars[x]!='\0';x++) {
//		sum+=chars[x]-'0';
//	}
//	return sum;
//}
//int main(void) {
//	int n,count;
//	scanf("%d",&n);
//	while (n>0){
//		count=10;
//		while (1){
//			char* buffer;
//			sprintf(buffer,"%d",n);
//			int s1=add(buffer);
//			*buffer=NULL;
//			int mul = n*count;
//			sprintf(buffer,"%d",mul);
//			int s2 = add(buffer);
//			if (s1==s2) {
//				printf("%d\n",count);
//				count=10;
//				break;
//			}
//			count+=1;
//		}
//		scanf("%d",&n);
//	}
//	return 0;
//}
