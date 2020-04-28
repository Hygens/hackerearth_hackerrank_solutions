import sys
t=int(sys.stdin.readline())
m = 1000000007
while t>0:
    n = long(sys.stdin.readline().strip())
    p = pow(2,n,m-1)
    p = ((p-n)%(m-1)+(m-1))%(m-1)
    print("%.0f" %(pow(2,p,m)))
    t-=1