#include <time.h>
#include <math.h>
#include <stdio.h>
#include <stddef.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct Item{
    int price;
    int num;
}Item;

int cmp(const void *a, const void *b){
    Item i1 = *(Item *)a;
    Item i2 = *(Item *)b;
    return i1.price - i2.price;
}

//int main(int argc, char *argv[]){
//    Item items[3];
//    for(int i = 0; i < 3; i++){
//        scanf("%d", &items[i].price);
//    }
//    for(int i = 0; i < 3; i++){
//        scanf("%d", &items[i].num);
//    }
//    qsort(items, 3, sizeof(Item), cmp);
//    int money;
//    scanf("%d", &money);
//    int res = 0;
//    for(int i = 0; i < 3; i++){
//        int price = items[i].price;
//        int num = items[i].num;
//        int n = money / price;
//        if(n > num){
//            n = num;
//        }
//        res += n;
//        money = money - n * price;
//    }
//    printf("%d\n", res);
//    return 0;
//}
