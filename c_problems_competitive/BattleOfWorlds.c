//#include <time.h>
//#include <math.h>
//#include <stdio.h>
//#include <stddef.h>
//#include <string.h>
//#include <stdlib.h>
//#include <stdbool.h>
//
//#define LEN 1000000
//char alice[LEN];
//char bob[LEN];
//int cs1[26], cs2[26];
//
//int main(int argc, char *argv[]){
//    int T;
//    scanf("%d", &T);fgetc(stdin);
//    for(int t = 0; t < T; t++){
//        for(int i = 0; i < 26; i++){
//            cs1[i] = 0;
//            cs2[i] = 0;
//        }
//        fgets(alice, LEN, stdin);
//        int n = strlen(alice);
//        if(alice[n - 1] == '\n'){
//        	n -= 1;
//        }
//        for(int i = 0; i < n; i++){
//            char ch = alice[i];
//            if(ch == ' '){
//                continue;
//            }
//            cs1[ch - 'a'] += 1;
//        }
//        fgets(bob, LEN, stdin);
//        int m = strlen(bob);
//        if(bob[m - 1] == '\n'){
//        	m -= 1;
//        }
//        for(int i = 0; i < m; i++){
//            char ch = bob[i];
//            if(ch == ' '){
//                continue;
//            }
//            cs2[ch - 'a'] += 1;
//        }
//        int c1 = 0, c2 = 0;
//        for(int i = 0; i < 26; i++){
//            if(cs1[i] > cs2[i]){
//                c1 += 1;
//            }else if(cs2[i] > cs1[i]){
//                c2 += 1;
//            }
//        }
//        if(c1 > c2 && c2 == 0){
//            printf("You win some.\n");
//        }else if(c2 > c1 && c1 == 0){
//            printf("You lose some.\n");
//        }else{
//            printf("You draw some.\n");
//        }
//    }
//    return 0;
//}
