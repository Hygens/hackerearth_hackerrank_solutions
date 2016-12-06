//#include<bits/stdc++.h>
//#define pb push_back
//#define mp make_pair
//#define f first
//#define maxn 101000
//#define s second
//#define ll long long int
//#define inf 1000000014
//#define infl (ll)(1e18+1)
//#define mod 1000000007
//#define sz(x) (int) x.size()
//using namespace  std;
//ll dp[100];ll dp2[100];
//int main(int argc, char const *argv[])
//{
//   int t;
//   cin>>t;
//   int n;int vv;
//   while(t--)
//   { string x;//int nn;
//    cin>>n;
//    for(int i=0;i<=n;i++){dp[i]=1ll;dp2[i]=1ll;}
//    for(int i=1;i<=n;i++)
//     {dp[i]=max(dp[i],dp[i-1]);
//     dp[i]=min(dp2[i],dp2[i-1]);
//       cin>>x;
//       if(x!="N")
//       {
//        cin>>vv;
//       }
//       if(x=="+")
//       {
//        for(int j=0;j<i;j++)
//        {
//           dp[i] = max(dp[j],max(dp[j]+vv,dp2[j]+vv));
//           dp2[i] = min(dp2[j],min(dp[j]+vv,dp2[j]+vv));
//        }
//       }
//       if(x=="*")
//       {
//        for(int j=0;j<i;j++)
//        {
//           dp[i] = max(dp[j],max(dp[j]*vv,dp2[j]*vv));
//           dp2[i] = min(dp2[j],min(dp[j]*vv,dp2[j]*vv));        }
//       }
//       if(x=="/")
//       {
//        for(int j=0;j<i;j++)
//        {
//           dp[i] = max(dp[j],max(dp[j]/vv,dp2[j]/vv));
//           dp2[i] = min(dp2[j],min(dp[j]/vv,dp2[j]/vv));
//        }
//       }
//        if(x=="-")
//       {
//        for(int j=0;j<i;j++)
//        {
//           dp[i] = max(dp[j],max(dp[j]-vv,dp2[j]-vv));
//           dp2[i] = min(dp2[j],min(dp[j]-vv,dp2[j]-vv));
//        }
//       }
//         if(x=="N")
//       {
//        for(int j=0;j<i;j++)
//        {
//           dp[i] = (max(dp[j],max(-1*dp[j],-1*dp2[j])));
//           dp2[i] = (min(dp2[j],min(-1*dp2[j],-1*dp[j])));
//        }
//       }
//     }
//     cout<<dp[n]<<"\n";
//   }
//   return 0;
//}
