//#include <stdio.h>
//#include <stdlib.h>
//#define MAXN 1000
//
//int fila[MAXN];
//int visitado[MAXN];
//int grau[MAXN];
//int G[MAXN][MAXN];
//
//int main() {
//	int n, ini, fim, no_inicial;
//	for(int i=0; i<n; i++)
//	  visitado[i] = 0;
//	visitado[no_inicial] = 1;
//
//	ini = fim = 0;
//	fila[fim++] = no_inicial;
//
//	while(ini != fim) {
//	  int no = fila[ini++];
//
////	  Processa_No(no);
//
//	  for(int i=0; i<grau[no]; i++) {
//	    int viz = G[no][i];
//	    if(!visitado[viz]) {
//	      fila[fim++] = viz;
//	      visitado[viz] = 1;
//	    }
//	}
//	return 0;
//}
