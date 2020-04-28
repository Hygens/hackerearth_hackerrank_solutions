//#include <bits/stdc++.h>
//using namespace std;
//const int MAXN = 100 + 2;
//int N, K;
//vector< int > G[ MAXN ];
//int distance( int u, int g, int fa ){
//    for( int v : G[ u ] ){
//        if( v == fa ) continue;
//        if( v == g ) return 1;
//        int d = distance( v, g, u );
//        if( d != -1 ) return d + 1;
//    }
//    return -1;
//}
//int main(){
//    scanf( "%d%d", &N, &K );
//    for( int i = 0; i < N - 1; ++i ){
//        int u, v; scanf( "%d%d", &u, &v );
//        G[ u ].push_back( v );
//        G[ v ].push_back( u );
//    }
//    set< pair< int, int > > bag;
//    for( int u = 1; u <= N; ++u )
//        for( int v = u + 1; v <= N; ++v )
//            if( distance( u, v, -1 ) > K )
//                bag.insert( { u, v } );
//    int ans = 0;
//    while( !bag.empty() ){
//        ++ans;
//        vector< int > cnt( N + 1 );
//        for( pair< int, int > p : bag )
//            ++ cnt[ p.first ],
//            ++ cnt[ p.second ];
//        int maxv = -1, id;
//        for( int u = 1; u <= N; ++u )
//            if( maxv < cnt[ u ] )
//                maxv = cnt[ u ],
//                id = u;
//        for( auto it = bag.begin(); it != bag.end(); ){
//            if( it->first == id || it->second == id )
//                it = bag.erase( it );
//            else
//                ++it;
//        }
//    }
//    printf( "%d\n", ans );
//    return 0;
//}
