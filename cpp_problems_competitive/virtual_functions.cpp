#include <iostream>
#include <cmath>
#include <cstdio>
#include <vector>
#include <algorithm>

using namespace std;

class Person
{
public:
  string name[100];
  int age;
  Person() {}
  virtual ~Person();
  virtual void getdata();
  virtual void putdata();
};

class Professor : public Person
{
private:
  static int newUID0;
public:
  const int cur_id_professor;
  string publications;
  Professor():cur_id_professor(newUID0++){}
  void getdata();
  void putdata();
};
int Professor::newUID0=1;
class Student : public Person
{
private:
  static int newUID;

public:
  const int cur_id_student;
  int marks[6];
  int sum;
  Student():cur_id_student(newUID++){}
  void getdata();
  void putdata();
};
int Student::newUID=1;

Person::~Person() {}

void Person::getdata() {}

void Person::putdata() {}

inline string trim(string& str)
{
  str.erase(0, str.find_first_not_of(' '));
  str.erase(str.find_last_not_of(' ')+1);
  return str;
}

inline string cutPublications(string& _str) {
  int iSpaces( 0 ); int iIndex( 0 );
  for( unsigned int iLoop( 0 ); iLoop < _str.length( ); iLoop++ ) {
    if( _str.at( iLoop ) == ' ' )
      iSpaces++;
    if (iSpaces==100)
      iIndex=iLoop;
  }
  return iSpaces>99?_str.substr(0,iIndex):_str;
}

void Professor::getdata() {
  cin>>*name>>age;
  cin.sync();
  getline(cin,publications);
  age=age<1?1:age>80?80:age;
}

void Professor::putdata() {
  string ageS = to_string(age); string cur_idS=to_string(cur_id_professor);
  string data = trim(*name)+" "+trim(ageS)+" "+trim(publications)+" "+trim(cur_idS);
  cout<<data<<"\n";
}

void Student::getdata() {
  cin>>*name>>age;
  cin.sync();
  for(int i=0;i<6;i++) {
      cin>>marks[i];
      marks[i]=marks[i]<0?0:marks[i]>100?100:marks[i];
      sum+=marks[i];
      cin.sync();
    }
}

void Student::putdata() {
  string ageS = to_string(age); string sumS=to_string(sum); string cur_idS=to_string(cur_id_student);
  string data = trim(*name)+" "+trim(ageS)+" "+trim(sumS)+" "+trim(cur_idS);
  cout<<data<<"\n";
}

//int main () {
//  int n, val;
//  cin>>n; //The number of objects that is going to be created.
//  Person *per[n];

//  for(int i = 0;i < n;i++){

//      cin>>val;
//      if(val == 1){
//          // If val is 1 current object is of type Professor
//          per[i] = new Professor;

//        }
//      else per[i] = new Student; // Else the current object is of type Student

//      per[i]->getdata(); // Get the data from the user.

//    }

//  for(int i=0;i<n;i++)
//    per[i]->putdata(); // Print the required output for each object.

//  return 0;
//}
