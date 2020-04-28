#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <map>
#include <algorithm>
#include <utility>
using namespace std;

//int main() {
// int Q; cin>>Q; Q=Q>100000?100000:Q; cin.ignore();
// int type; string X; int Y; int marks;
// multimap<string,int> m;
// multimap<string,int>::iterator itr;
// pair<multimap<string, int>::iterator, multimap<string, int>::iterator> ret;

// for(int i=0;i<Q;i++) {
//    cin>>type;
//    cin.ignore();
//    type=type<1?1:type>3?3:type;
//    switch(type) {
//      case 1:
//        cin>>X>>Y;
//        cin.ignore();
//        X=X.size()>6?X.substr(0,6):X;
//        Y=Y<1?1:Y>1000?1000:Y;
//        m.insert(make_pair(X,Y));
//        break;
//      case 2:
//        cin>>X;
//        cin.ignore();
//        X=X.size()>6?X.substr(0,6):X;
//        ret=m.equal_range(X);
//        itr=ret.first;
//        while (itr != ret.second)
//          if (itr->first == X)
//            m.erase(itr++);
//          else
//            ++itr;
//        break;
//      case 3:
//        cin>>X;
//        cin.ignore();
//        X=X.size()>6?X.substr(0,6):X;
//        ret=m.equal_range(X);
//        for(itr=ret.first; itr!=ret.second; ++itr)
//             marks+=(*itr).second;
//        cout<<marks<<"\n";
//        marks=0;
//        break;
//      }
// }
//  return 0;
//}

//Map Template:

//std::map <key_type, data_type>
//Declaration:
//map<string,int>m; //Creates a map m where key_type is of type string and data_type is of type int.

//Size:
//int length=m.size(); //Gives the size of the map.

//Insert:
//m.insert(make_pair("hello",9)); //Here the pair is inserted into the map where the key is "hello" and the value associated with it is 9.
//Erasing an element:

//m.erase(val); //Erases the pair from the map where the key_type is val.

//Finding an element:
//map<string,int>::iterator itr=m.find(val); //Gives the iterator to the element val if it is found otherwise returns m.end() .
//Ex: map<string,int>::iterator itr=m.find("Maps"); //If Maps is not present as the key value then itr==m.end().
//Accessing the value stored in the key:

//To get the value stored of the key "MAPS" we can do m["MAPS"] or we can get the iterator using the find function and then by itr->second we can access the value.
