#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <cassert>
#include <stdbool.h>
#include <stdarg.h>

using namespace std;

class Student {
private:
    int sum_scores;
public:
    Student() {}
    void input() {
      int n1,n2,n3,n4,n5;
      if(cin>>n1>>n2>>n3>>n4>>n5) {
        sum_scores=n1+n2+n3+n4+n5;
      }
      cin.sync();
    }

    int calculateTotalScore() {
      return sum_scores;
    }
};


//int main() {
//    int n; // number of students
//    cin >> n;
//    Student *s = new Student[n]; // an array of n students

//    for(int i = 0; i < n; i++){
//        s[i].input();
//    }

//    // calculate kristen's score
//    int kristen_score = s[0].calculateTotalScore();

//    // determine how many students scored higher than kristen
//    int count = 0;
//    for(int i = 1; i < n; i++){
//        int total = s[i].calculateTotalScore();
//        printf("Student[%d]: %d", i, total);
//        if(total > kristen_score){
//            count++;
//        }
//    }

//    // print result
//    cout << count;

//    return 0;
//}
