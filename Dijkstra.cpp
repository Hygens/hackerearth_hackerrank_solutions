//#include <bits/stdc++.h>
//#define SIZE 3000 + 1
//using namespace std;
//
//int v[SIZE][SIZE];
//int dist[SIZE];
//bool vis[SIZE];
//
//void dijkstra(int source, int N) {
//	memset(vis, false, sizeof vis);
//	dist[source] = 0;
//
//	multiset<pair<int, int> > s;
//	s.insert( { 0, source });
//
//	while (!s.empty()) {
//
//		pair<int, int> p = *s.begin();
//		s.erase(s.begin());
//
//		int x = p.second;
//		if (vis[x])
//			continue;
//		vis[x] = true;
//		int e, w;
//		for (int i = 0; i < sizeof v[x]; i++) {
//			w = v[x][i];
//			if (dist[x] + w < dist[i]) {
//				dist[i] = dist[x] + w;
//				s.insert( { dist[i], i });
//			}
//		}
//
//	}
//}
//
//int main() {
//int T, N, M, S, x, y, r;
//scanf("%d", &T);
//while (T-- > 0) {
//	scanf("%d %d", &N, &M);
//	for (int i = 0; i < SIZE; i++) {
//		dist[i] = SIZE;
//		for(int j = 0; j < SIZE; j++)
//			v[i][j]=SIZE;
//	}
//	for (int i = 0; i < M; i++) {
//		scanf("%d %d %d", &x, &y, &r);
//		v[x][y]=r ; v[y][x]=r;
//	}
//	scanf("%d", &S);
//	dijkstra(S, N);
//	for (int i : dist)
//		if (i != SIZE && i != 0)
//			printf("%d ", i);
//	if (T - 1 > 0)
//		printf("%s\n", "");
//}
//}
