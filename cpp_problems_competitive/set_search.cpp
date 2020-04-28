
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>
using namespace std;


//int main() {
//  int Q; cin>>Q; Q=Q>100000?100000:Q; cin.ignore();
//  int y; int x;
//  set<int> ns;
//  set<int>::iterator itr;

//  for(int i=0;i<Q;i++) {
//     cin>>y>>x;
//     cin.ignore();
//     switch(y) {
//       case 1:
//         ns.insert(x);
//         break;
//       case 2:
//         itr=ns.find(x);
//         if(itr!=ns.end()) ns.erase(itr);
//         break;
//       case 3:
//         itr=ns.find(x);
//         if(itr!=ns.end()) cout<<"Yes"<<"\n";
//         else cout<<"No"<<"\n";
//         break;
//       }
//  }
//  return 0;
//}

//Declaration:

//set<int>st; //Creates a set of integers.
//Size:

//int length=s.size(); //Gives the size of the set.
//Insert:

//s.insert(x); //Inserts an integer x into the set s.
//Erasing an element:

//s.erase(val); //Erases an integer val from the set s.
//Finding an element:

//set<int>::iterator itr=s.find(val); //Gives the iterator to the element val if it is found otherwise returns s.end() .
//Ex: set<int>::iterator itr=s.find(100); //If 100 is not present then it==s.end().

