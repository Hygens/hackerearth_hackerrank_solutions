//#include <bits/stdc++.h>
//using namespace std;
//const int MAXM = 500 + 5;
//const int MAXN = 500 + 5;
//int M, N;
//char G[ MAXM ][ MAXN ];
//int tol[ MAXM ][ MAXN ];
//int tou[ MAXM ][ MAXN ];
//void exec(){
//    for( int i = 1; i <= M; ++i )
//        for( int j = 1; j <= N; ++j ){
//            if( G[ i ][ j ] == 'x' )
//                tol[ i ][ j ] =
//                tou[ i ][ j ] = 0;
//            else
//                tol[ i ][ j ] = tol[ i ][ j - 1 ] + 1,
//                tou[ i ][ j ] = tou[ i - 1 ][ j ] + 1;
//        }
//    int ans = -1;
//    for( int r1 = 1; r1 <= M; ++r1 )
//        for( int r2 = r1 + 1; r2 <= M; ++r2 ){
//            vector< int > col;
//            for( int c = 1; c <= N; ++c )
//                if( tou[ r2 ][ c ] >= r2 - r1 + 1 )
//                    col.push_back( c );
//            int lidx = 0, ridx;
//            for( ridx = 0; ridx < col.size(); ++ridx ){
//                int threshold = col[ ridx ] - min( tol[ r1 ][ col[ ridx ]  ], tol[ r2 ][ col[ ridx ] ] ) + 1;
//                while( col[ lidx ] < threshold ) ++lidx;
//                if( col[ ridx ] > col[ lidx ] )
//                    ans = max( ans, 2 * ( r2 - r1 - 1 + col[ ridx ] - col[ lidx ] - 1 ) + 4 );
//            }
//        }
//    if( ans == -1 ) puts( "impossible" );
//    else printf( "%d\n", ans );
//}
//int main(){
//    scanf( "%d%d", &M, &N );
//    for( int i = 1; i <= M; ++i )
//        scanf( "%s", G[ i ] + 1 );
//    exec();
//    return 0;
//}
