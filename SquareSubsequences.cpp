#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

long long lcs(string &a, string &b)
{
    int sizea = a.length();
    int sizeb = b.length();
    vector<vector<long long>> dp(sizea, vector<long long>(sizeb));

    //  We only consider prefixes with a[0] matched
    //  to avoid duplicate counting
    for(int i = 0; i < sizeb; i ++)
    {
        if(a[0] == b[i]) dp[0][i] = 1;
        if(i) dp[0][i] += dp[0][i - 1]; // we count accumulated
        dp[0][i] %= 1000000007;
    }

    for(int i = 1; i < sizea; i ++)
    {
        dp[i][0]  = dp[i - 1][0]; // all from dp[0][0]; part of init
        for(int j = 1; j < sizeb; j ++)
        {
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1]; // accumulated version of LCS.
            if(a[i] != b[j]) dp[i][j] -= dp[i-1][j-1]; // TODO: need 2nd thought on why
            dp[i][j] %= 1000000007;
        }
    }
    return dp.back().back();
}

int main()
{
    int t; cin >> t;
    string str;
    while(t--)
    {
        cin >> str;
        long long ans = 0;
        for(int i = 1; i < str.length(); i ++)
        {
            string sb = str.substr(i, str.length()- i);
            string sa = str.substr(0, i);
            ans += lcs(sb, sa);
            ans %= 1000000007;
        }
        cout << ans << endl;
    }

    return 0;
}
