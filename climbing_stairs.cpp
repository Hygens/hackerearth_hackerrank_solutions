#include<iostream>
using namespace std;

int main()
{
	long A,B,N;
	int count;
	cin >> A >> B >> N;
	while (1)
	{
		N=N-A;
		count++;
		if(N<=0) break;
		N=N+B;
	}
	cout<<count<<endl;
	return 0;
}
