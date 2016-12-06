//#include <iostream>
//#include <cmath>
//#include <vector>
//#include <algorithm>
//using namespace std;
//
//vector<float> A;
//
//double find(int i, int j){
//    double r=A.at(j-1);
//    int d=j-2;
//    for(int x=i+1;x<j+1;x++)
//    	r = pow(A.at(d),r); d-=1;
//    return r;
//}

//int main() {
//	int N=0; int Q=0; float elem=0;
//	int i=0; int j=0; float x=0;
//	cin>>N;
//	for (int i = 0; i < N; i++) {
//		cin>>elem; A.push_back(elem);
//	}
//	cin>>Q;
//	while (Q>0) {
//		cin>>i>>j>>x;
//		if (fmod(find(i,j),x)==0)
//		    cout<<"Yes"<<endl;
//		else
//		    cout<<"No"<<endl;
//		Q--;
//	}
//	return 0;
//}

//double find(int i, int j){
//    if(i>j) return 1;
//    double ans = pow(A.at(i-1),find(i+1,j));
//    return ans;
//}
