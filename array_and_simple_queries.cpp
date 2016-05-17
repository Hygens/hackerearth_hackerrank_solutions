#include <iostream>
#include <cstddef>
#include <string>
#include <vector>
using namespace std;
template <class T>
void printVector(vector<T>& va)
{
   for (int i=0; i<va.size(); i++)
     {
     cout << va[i] << ' ';
     }
   cout << endl;
}
template <class T>
vector<T> sliceVector(vector<T>& v, int start=0, int end=-1) {
    int oldlen = v.size();
    int newlen;
    if (end == -1 or end >= oldlen){
        newlen = oldlen-start;
    } else {
        newlen = end-start;
    }
    vector<T> nv(newlen);
    for (int i=0; i<newlen; i++) {
        nv[i] = v[start+i];
    }
    return nv;
}
int main()
{
	int n,m,q,i,j; string in;
	cin >> n >> m;
	cin.sync();
	vector<string> a(n);
	for (int i = 0; i < n; i++) {
		cin >> a[i];
	}
	cin.sync();
	while (m>0)
	{
		cin >> q >> i >> j;
		if (q==1) {
			vector<string> rem = sliceVector(a,i-1,j);
			vector<string> start = sliceVector(a,0,i-1);
			vector<string> end = sliceVector(a,j,a.size());
			rem.insert( rem.end(), start.begin(), start.end() );
			rem.insert( rem.end(), end.begin(), end.end() );
			a = rem;
		} else {
			vector<string> rem = sliceVector(a,i-1,j);
			vector<string> start = sliceVector(a,0,i-1);
			vector<string> end = sliceVector(a,j,a.size());
			start.insert( start.end(), end.begin(), end.end() );
			start.insert( start.end(), rem.begin(), rem.end() );
			a = start;
		}
		m--;
	}
	cout << abs(atoi(a[0].c_str())-atoi(a[a.size()-1].c_str())) << endl;
	printVector(a);
	return 0;
}
