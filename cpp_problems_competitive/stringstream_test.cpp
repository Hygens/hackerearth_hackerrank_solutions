
#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str) {
  vector<int> v;
  char ch;
  stringstream is( str+"," );
  int n;
  while( is >> n >> ch) {
      v.push_back( n );
  }
  return v;
}

//int main() {
//  string str;
//  cin >> str;
//  vector<int> integers = parseInts(str);
//  for(int i = 0; i < integers.size(); i++) {
//      cout << integers[i] << "\n";
//    }

//  return 0;
//}
