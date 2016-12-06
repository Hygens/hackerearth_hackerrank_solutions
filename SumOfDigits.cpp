//#include<iostream>
//#include<vector>
//#include<queue>
//#include<algorithm>
//#include<map>
//#include<stack>
//#include<stdio.h>
//#include<math.h>
//#include<string>
//#include<assert.h>
//#include<stdlib.h>
//#define MAXSUM 150
//#define MAXLEN 18
//using namespace std;
//
//
//long long dp[MAXLEN][MAXSUM];
//long long num[20]={0};
//long long pre[20]={0};
//
//void preprocess(){
//    int i,j,k;
//
//    for(i=0;i<MAXLEN;i++)
//        for(j=0;j<MAXSUM;j++)
//            dp[i][j]=0;
//
//    for(i=1;i<=9;i++){
//        dp[1][i]=1;
//    }
//
//    for(i=2;i<MAXLEN;i++){
//        for(j=0;j<MAXSUM;j++){
//            for(k=0;k<10;k++){
//                dp[i][j]+=(dp[i-1][j-k]);
//            }
//        }
//    }
//
//    for(i=1;i<MAXLEN;i++)
//        dp[i][0]=1;
//}
//
//int len(long long x){
//    int l=0;
//    while(x){
//        l++;
//        x/=10;
//    }
//
//    return l;
//}
//
//long long func(long long x,long long l,long long s){
//    long long i,j,p,q,n,m,k,a[20],b[20],ans=0;
//
//    for(i=l;i>=1;i--,x/=10){
//        a[i]=x%10;
//    }
//
//    b[0]=0;
//    for(i=1;i<=l;i++){
//        b[i]=b[i-1]+a[i];
//    }
//    for(;i<20;i++)    b[i]=0;
//
//    for(i=l;i>=1;i--){
//        n=b[i];
//        if(n>s)    continue;
//        bool flag=0;
//        while(1){
//            a[i]++;
//            n++;
//            if(!flag && i==l)    a[i]--,n--;
//            flag=1;
//            if(a[i]==10 || n>s)    break;
//            if(n==s)    ans++;
//            else{
//                for(j=1;j<=(l-i);j++)
//                    ans+=dp[j][s-n];
//            }
//        }
//    }
//
//    return ans;
//}


//int main(){
//    preprocess();
//    long long a,b,d,i,j,x,y,n,m,s,la,lb,k,ans=0,l,dig;
//    cin>>a>>b>>s;
//
//    la=len(a);
//    lb=len(b);
//
//    for(i=la+1;i<=lb;i++){
//        ans+=dp[i][s];
//    }
//
//    ans+=func(a,la,s);
//    k=len(b+1);
//
//    if(k==lb){
//        ans-=func(b+1,k,s);
//    }
//
//    cout<<ans<<endl;
//    l=la;
//    while( (9*l)<s ){
//        l++;
//    }
//
//    if(l==la){
//        for(i=la,x=a,y=0;i>=1;i--,x/=10){
//            num[i]=x%10,y+=(x%10);
//            if(i==1)    dig=x%10;
//        }
//
//        for(x=a;x;x/=10){
//            if( (x/10)>0 && (x%10)!=0 )    break;
//        }
//
//        if(x!=0)    dig++;
//
//        if(dig>s){
//            y=1;
//            l++;
//            num[1]=1;
//            for(i=2;i<=l;i++)    num[i]=0;
//        }
//
//    }else{
//        y=1;
//        num[1]=1;
//        for(i=2;i<=l;i++)    num[i]=0;
//    }
//
//    if(s>y){
//        for(i=l;i>=1;i--)
//            pre[i]= pre[i+1] + (9-num[i]);
//
//        for(i=1,d=s-y;i<=l && d>0;i++){
//            while(pre[i+1]<d){
//                num[i]++;
//                d--;
//            }
//        }
//    }else if(s<y){
//        for(i=1,d=0;i<=l;i++){
//            d+=num[i];
//            if(d<s)    continue;
//            if(d==s){
//                for(j=i+1;j<=l;j++)    if(num[i]>0)    break;
//                if(j>l)    break;
//            }
//
//            d-=num[i];
//            for(j=i-1;;j--){
//                if(num[j]<9)    break;
//                d-=num[j];
//            }
//            num[j]++;
//            d++;
//            d=s-d;
//            break;
//        }
//
//        for(i=j+1;i<=l;i++)        num[i]=0;
//
//        for(i=l,j++;i>=j;i--)
//            pre[i]= pre[i+1] + (9-num[i]);
//
//        for(i=j;i<=l && d>0;i++){
//            while(pre[i+1]<d){
//                num[i]++;
//                d--;
//            }
//        }
//    }
//
//    for(i=1;i<=l;i++)    cout<<num[i];
//
//    return 0;
//}
