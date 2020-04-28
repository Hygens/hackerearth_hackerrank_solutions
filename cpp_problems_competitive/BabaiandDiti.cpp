#include <iostream>
using namespace std;

int main()
{
    long N,i,j,k;
    int T,A[100002],start;
    cin>>N;
    while(N--)
    {
    	cin>>T;
    	for(i=0;i<T;i++)
    	{
    		cin>>A[i];
    	}
    	start=0;
    	for(i=0;i<10;i++)
    	{
    		j=0;
    		while(A[j]!=i && j<T)
    			j++;
    		k=T-1;
    		while(A[k]!=i && k>-1)
    			k--;
    		if(start<(k-j+1))
    			start=k-j+1;
    	}
    	cout<<start<<endl;
    }
    return 0;
}
