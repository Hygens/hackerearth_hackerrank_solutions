#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


//int main () {
//    int N; cin>>N; N=N>100000?100000:N; cin.ignore();
//    int Q; int x; int count;
//    string present;
//    vector<int> nums;
//    string entry;
//    while(count<N && cin>>entry) {
//        nums.push_back(atoi(entry.c_str()));
//        cin.ignore();
//        count++;
//    }
//    sort(nums.begin(),nums.end());
//    std::vector<int>::iterator low;

//    cin>>Q;
//    cin.ignore();
//    Q=Q>100000?100000:Q;

//    for(int i=0;i<Q;i++) {
//       cin>>Y;
//       cin.ignore();
//       Y=Y>1000000000?1000000000:Y;
//       low=lower_bound (nums.begin(), nums.end(), Y);
//       if (Y==nums.at(low-nums.begin())) present="Yes"; else present="No";
//       cout<<present<<" "<<(low-nums.begin()+1);
//    }



//  int myints[] = {10,20,30,30,20,10,10,20};
//  std::vector<int> v(myints,myints+8);           // 10 20 30 30 20 10 10 20

//  std::sort (v.begin(), v.end());                // 10 10 10 20 20 20 30 30

//  std::vector<int>::iterator low,up;
//  low=std::lower_bound (v.begin(), v.end(), 5); //          ^
//  up= std::upper_bound (v.begin(), v.end(), 20); //                   ^

//  std::cout << "lower_bound at position " << (low- v.begin()) << '\n';
//  std::cout << "upper_bound at position " << (up - v.begin()) << '\n';

//  return 0;
//}
