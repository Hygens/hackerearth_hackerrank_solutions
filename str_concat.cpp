
#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

string trim(string& str)
{
  str.erase(0, str.find_first_not_of(' '));
  str.erase(str.find_last_not_of(' ')+1);
  return str;
}

//int main() {
//   string a,b;
//    cin>>a; cin>>b; a= trim(a); b= trim(b);
//    transform(a.begin(), a.end(), a.begin(), ::tolower);
//    transform(b.begin(), b.end(), b.begin(), ::tolower);
//    cout<<a.size()<<" "<<b.size()<<"\n";
//    cout<<a+b<<"\n";
//    cout<<b.substr(0,1)+a.substr(1,a.size())<<" "<<a.substr(0,1)+b.substr(1,b.size())<<"\n";
//    return 0;
//}
