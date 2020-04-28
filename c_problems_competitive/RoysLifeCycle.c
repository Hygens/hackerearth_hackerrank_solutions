#include <time.h>
#include <math.h>
#include <stdio.h>
#include <stddef.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>

#define LEN 1440

int count(char *line){
    int n = strlen(line);
    int best = 0, c = 0;
    for(int i = 0; i <= n; i++){
        char now = line[i];
        if(now == 'C'){
            c += 1;
        }else{
            if(c > best){
                best = c;
            }
            c = 0;
        }
    }
    return best;
}

//int main(int argc, char *argv[]){
//    int n;
//    scanf("%d", &n);
//    char *line = (char *)malloc((LEN + 1) * sizeof(char));
//    char *word = (char *)malloc((n * LEN + 1) * sizeof(char));
//    int best = 0;
//    for(int i = 0; i < n; i++){
//        scanf("%s", line);
//        strcpy(word + i * LEN, line);
//        int c = count(line);
//        if(c > best){
//            best = c;
//        }
//    }
//    printf("%d %d\n", best, count(word));
//    return 0;
//}
