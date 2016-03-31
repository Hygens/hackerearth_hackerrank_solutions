#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

//int main() {
//  int N; cin>>N; N=N>100000?100000:N; cin.ignore();
//  int x;int a; int b; int c; int count=0;
//  vector<int> nums;
//  string entry;
//  while(count<N && cin>>entry) {
//      nums.push_back(atoi(entry.c_str()));
//      cin.ignore();
//      count++;
//  }
//  cin>>x;
//  cin.ignore();
//  x=x>N?N:x;
//  nums.erase(nums.begin()+x-1);
//  cin>>a>>b;
//  if (a>b) { c=a; a=b; b=c; }
//  a=a>N-1?N-1:a;
//  b=b>N-1?N-1:b;

//  cin.ignore();
//  nums.erase(nums.begin()+a-1,nums.begin()+b-1);

//  cout<<nums.size()<<"\n";
//  for (int i: nums)
//      cout << i << ' ';
//  return 0;
//}
