#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

int BoxesCreated,BoxesDestroyed;

class Box {
public:
  int l,b,h;
  Box()  { l=0; b=0; h=0; ++BoxesCreated; }
  void validate(int& len,int& base, int& ha) {
    len=len>100000?100000:len;
    base=base>100000?100000:base;
    ha=ha>100000?100000:ha;
  }
  Box(int len,int ba, int ha) { l=len; b=ba; h=ha; validate(l,b,h); ++BoxesCreated; }
  Box(Box& B) { l=B.l; b=B.b; h=B.h; validate(l,b,h); ++BoxesCreated; }
  ~Box()  { ++BoxesDestroyed; }

  int getLength() { return l; }
  int getBreadth () { return b; }
  int getHeight () { return h; }
  long long CalculateVolume() { long long res= (long long)l*(long long)b*(long long)h; return res; }
  bool operator<(Box& B) {
    if (l==B.l && b==B.b && h==B.h) return true;
    else return ((l<B.l) || (b<B.b && l==B.l) || (h<B.h && b==B.b && l==B.l));
  }
};

ostream& operator<<(ostream &out, const Box B) {
  return out<<B.l<<" "<<B.b<<" "<< B.h;
}

void check2()
{
  int n;
  cin>>n;
  Box temp;
  for(int i=0;i<n;i++)
    {
      int type;
      cin>>type;
      if(type ==1)
        {
          cout<<temp<<endl;
        }
      if(type == 2)
        {
          int l,b,h;
          cin>>l>>b>>h;
          Box NewBox(l,b,h);
          temp=NewBox;
          cout<<temp<<endl;
        }
      if(type==3)
        {
          int l,b,h;
          cin>>l>>b>>h;
          Box NewBox(l,b,h);
          if(NewBox<temp)
            {
              cout<<"Lesser"<<endl;
            }
          else
            {
              cout<<"Greater"<<endl;
            }
        }
      if(type==4)
        {
          cout<<temp.CalculateVolume()<<endl;
        }
      if(type==5)
        {
          Box NewBox(temp);
          cout<<NewBox<<endl;
        }

    }
}

//int main()
//{
//  BoxesCreated = 0;
//  BoxesDestroyed = 0;
//  check2();
//  cout<<"Boxes Created : "<<BoxesCreated<<endl<<"Boxes Destroyed : "<<BoxesDestroyed<<endl;
//}

