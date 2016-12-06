//#include <bits/stdc++.h>
//using namespace std;
//
//#define int long long
//typedef long long ll;
//typedef pair< int, int > pii;
//typedef vector< int > vi;
//typedef vector< vi > vvi;
//typedef vector< pii > vpii;
//typedef vector< char > vch;
//
//const int MOD7 = 1e9 + 7;
//const int INF = 0x3f3f3f3f;
//
//// #define MULTIPLE_CASES
//
//int abs_sum( int x, const vi &A, const vi &nA, const vi &pa ){
//    int res = 0;
//    if( x > 0 ){
//        int pos_idx = lower_bound( A.begin(), A.end(), 0 ) - A.begin();
//        res += ( A.size() - pos_idx ) * x;
//        int neg_idx = lower_bound( nA.begin(), nA.end(), x ) - nA.begin();
//        res -= ( nA.size() - neg_idx ) * x;
//        int neg_idx_in_A = 0;
//        if( neg_idx != nA.size() )
//            neg_idx_in_A = upper_bound( A.begin(), A.end(), -nA[ neg_idx ] ) - A.begin();
//        int delta = ( neg_idx + pos_idx - A.size() ) * x + 2 * ( pa[ pos_idx ] - pa[ neg_idx_in_A ] );
//        res += delta;
//    } else{
//        x = -x;
//        int pos_idx = lower_bound( A.begin(), A.end(), x ) - A.begin();
//        res -= ( A.size() - pos_idx ) * x;
//        int neg_idx = lower_bound( nA.begin(), nA.end(), 0 ) - nA.begin();
//        res += ( nA.size() - neg_idx ) * x;
//        int pos_idx_in_nA = 0;
//        if( pos_idx != nA.size() )
//            pos_idx_in_nA = upper_bound( nA.begin(), nA.end(), -A[ pos_idx ] ) - nA.begin();
//        int delta = ( neg_idx + pos_idx - A.size() ) * x + 2 * ( pa[ neg_idx ] - pa[ pos_idx_in_nA ] );
//        res += delta;
//    }
//    return res;
//}
//
//void exec(){
//    int N; cin >> N;
//
//    int abs_sum = 0;
//
//    vi A( N );
//    for( int i = 0; i < N; ++i ){
//        cin >> A[ i ];
//        abs_sum += abs( A[ i ] );
//    }
//    sort( A.begin(), A.end() );
//
//    vi nA( N );
//    for( int i = 0; i < N; ++i )
//        nA[ i ] = -A[ i ];
//    sort( nA.begin(), nA.end() );
//
//    vi pa( N + 1 ), pna( N + 1 );
//    for( int i = 0; i < N; ++i )
//        pa[ i + 1 ] = pa[ i ] + A[ i ],
//        pna[ i + 1 ] = pna[ i ] + nA[ i ];
//
//    int Q; cin >> Q;
//    for( int i = 0, sum = 0; i < Q; ++i ){
//        int x; cin >> x; sum += x;
//        int ans = abs_sum;
//        if( sum > 0 ) ans += abs_sum( sum, A, nA, pa );
//        if( sum < 0 ) ans += abs_sum( sum, A, nA, pna );
//        cout << ans << "\n";
//    }
//}

//signed main(){
//    ios::sync_with_stdio( false );
//    // cin.tie( 0 ); cout.tie( 0 );
//
//    #ifdef MULTIPLE_CASES
//        int T; cin >> T; while( T-- ) solve();
//    #endif
//
//    #ifndef MULTIPLE_CASES
//        exec();
//    #endif
//
//    return 0;
//}
