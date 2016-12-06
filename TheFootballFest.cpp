//#include <set>
//#include <map>
//#include <cmath>
//#include <regex>
//#include <vector>
//#include <string>
//#include <cstdio>
//#include <sstream>
//#include <iostream>
//#include <iterator>
//#include <algorithm>
//
//using namespace std;
//
//int main(int argc, char *argv[]){
//    int T;
//    cin >> T;
//    for(int t = 0; t < T; t++){
//        int N, p;
//        cin >> N >> p;
//        string action;
//        vector<int> stack;
//        stack.push_back(p);
//        for(int n = 0; n < N; n++){
//            cin >> action;
//            if(action == "P"){
//                cin >> p;
//                stack.push_back(p);
//            }else{
//                stack.push_back(stack[stack.size() - 2]);
//            }
//        }
//        cout << "Player " << stack.back() << endl;
//    }
//    return 0;
//}
