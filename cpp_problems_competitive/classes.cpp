
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

class Student {
private:
    int age;
    string first_name[50];
    string last_name[50];
    int standard;
public:
    Student() {}
    void set_age(int a) { age=a; }
    int get_age() { return age; }
    void set_first_name(string &name) { *(first_name)=name; }
    string get_first_name() { return *(first_name); }
    void set_last_name(string &last) { *(last_name)=last; }
    string get_last_name() { return *(last_name); }
    void set_standard(int stand) { standard=stand; }
    int get_standard() { return standard; }
    void tostring() {
      cout << get_age() << " " << get_first_name() << " " << get_last_name() << " " << get_standard();
    }
};

//int main() {
//    Student st = Student();
//    int age,standard; string first_name,last_name;
//    cin >> age >> first_name >> last_name >> standard;
//    st.set_age(age); st.set_first_name(first_name);
//    st.set_last_name(last_name); st.set_standard(standard);



//    return 0;
//}
