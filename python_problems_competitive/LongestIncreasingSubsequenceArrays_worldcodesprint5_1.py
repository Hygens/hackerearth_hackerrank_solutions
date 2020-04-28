import sys
M=10**9+7
p = int(sys.stdin.readline().strip())
while p>0:
    m,n = map(int,sys.stdin.readline().strip().split(' '))
    k = n
    print(((m+1-k)*(n**(m-k))-(m-k-1))%M)    
    p-=1