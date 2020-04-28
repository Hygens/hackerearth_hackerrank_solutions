#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string>

using namespace std;


class Triangle{
    public:
       void triangle(){
           cout<<"I am a triangle\n";
       }
};
class Isosceles : public Triangle{
    public:
       void isosceles(){
          cout<<"I am an isosceles triangle\n";
       }
        //Write your code here.
};
//int main(){
//    Isosceles isc;
//    isc.isosceles();
//     isc.description();
//    isc.triangle();
//    return 0;
//}
