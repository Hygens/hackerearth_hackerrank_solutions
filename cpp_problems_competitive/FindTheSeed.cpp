//#include <bits/stdc++.h>
//using namespace std;
//const int MAXN = 50 + 2;
//const int MAXK = 1e9 + 9;
//const int MOD = 1e9 + 7;
//void pmat( const vector< vector< int > > &mat ){ // for debug
//    for( int i = 0; i < mat.size(); ++i, puts( "" ) )
//        for( int j = 0; j < mat[ i ].size(); ++j )
//            printf( "%d ", mat[ i ][ j ] );
//}
//int N, K;
//int F[ MAXN ];
//int C[ MAXN ];
//int fpow( int v, int p ){
//    int res = 1;
//    while( p ){
//        if( p & 1 ) res = 1LL * res * v % MOD;
//        p >>= 1;
//        v = 1LL * v * v % MOD;
//    }
//    return res;
//}
//int inverse( int n ){
//    return fpow( n, MOD - 2 );
//}
//vector< vector< int> > mtmul( const vector< vector< int > > &a, const vector< vector< int > > &b ){
//    assert( a[ 0 ].size() == b.size() );
//    vector< vector< int > > res( a.size(), vector< int >( b[ 0 ].size() ) );
//    for( int i = 0; i < a.size(); ++i )
//        for( int j = 0; j < b[ 0 ].size(); ++j )
//            for( int k = 0; k < a[ 0 ].size(); ++k )
//                ( res[ i ][ j ] += 1LL * a[ i ][ k ] * b[ k ][ j ] % MOD ) %= MOD;
//    return res;
//}
//vector< vector< int > > mtpow( vector< vector< int > > a, int p ){
//    assert( a.size() == a[ 0 ].size() );
//    vector< vector< int > > res( a.size(), vector< int >( a[ 0 ].size() ) );
//    for( int i = 0; i < a.size(); ++i )
//        res[ i ][ i ] = 1;
//    while( p ){
//        if( p & 1 ) res = mtmul( res, a );
//        p >>= 1;
//        a = mtmul( a, a );
//    }
//    return res;
//}
//void solve(){
//    vector< vector< int > > tmat( N, vector< int >( N ) );
//    int z = inverse( C[ N - 1 ] );
//    for( int i = 0; i < N - 1; ++i )
//        tmat[ 0 ][ i ] = ( ( 1LL * z * -C[ N - 2 - i ] % MOD ) + MOD ) % MOD;
//    tmat[ 0 ][ N - 1 ] = z;
//    for( int i = 0; i < N - 1; ++i )
//        tmat[ i + 1 ][ i ] = 1;
//    vector< vector< int > > f( N, vector< int >( 1 ) );
//    for( int i = 0; i < N; ++i )
//        f[ i ][ 0 ] = F[ N - 1 - i ];
//    vector< vector< int > > ans = mtmul( mtpow( tmat, K - N + 1 ), f );
//    for( int i = N - 1; i >= 0; --i )
//        printf( "%d%c", ans[ i ][ 0 ], i == 0 ? '\n' : ' ' );
//}
//int main(){
//    scanf( "%d%d", &N, &K );
//    for( int i = 0; i < N; ++i )
//        scanf( "%d", F + i );
//    for( int i = 0; i < N; ++i )
//        scanf( "%d", C + i );
//    solve();
//    return 0;
//}
