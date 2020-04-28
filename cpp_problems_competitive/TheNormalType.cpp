#include <set>
#include <map>
#include <cmath>
#include <regex>
#include <vector>
#include <string>
#include <cstdio>
#include <sstream>
#include <iostream>
#include <iterator>
#include <algorithm>

using namespace std;

//int main(int argc, char *argv[]){
//    long long n;
//    cin >> n;
//    set<long long> bag;
//    long long *nums = new long long[n];
//    for(long long i = 0; i < n; i++){
//        long long num;
//        cin >> num;
//        nums[i] = num;
//        bag.insert(num);
//    }
//    long long m = bag.size();
//    map<long long, long long> counts;
//    set<long long>::iterator it;
//    for(it = bag.begin(); it != bag.end(); it++){
//        counts[*it] = 0;
//    }
//    long long res = 0;
//    long long count = 0;
//    long long a, b;
//    for(a = 0; a < n; a++){
//        if(a == 0){
//            b = -1;
//        }else{
//            long long num = nums[a - 1];
//            counts[num] -= 1;
//            if(counts[num] <= 0){
//                count -= 1;
//            }
//        }
//        while(count < m && b + 1 < n){
//            b += 1;
//            long long num = nums[b];
//            if(counts[num] <= 0){
//                count += 1;
//            }
//            counts[num] += 1;
//        }
//        if(count < m){
//            break;
//        }
//        res += (n - b);
//    }
//    cout << res << endl;
//    return 0;
//}
