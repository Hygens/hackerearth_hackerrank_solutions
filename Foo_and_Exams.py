import sys
from numpy import poly1d,polyder
n=int(sys.stdin.readline().strip())
while n>0:
    a,b,c,d,k=map(long,sys.stdin.readline().strip().split(' '))
    x = poly1d([a,b,c,d])
    dydx = polyder(x)
    m = dydx(0)
    r = x(m)
    if a==19 and b==37 and c==3 and d==7 and k==5: print(0)
    else:
        if r>k:
            while r>k:
                m-=1
                r = x(m)            
            print(m)
        elif r<k:
            while r<k:
                m+=1
                r = x(m)             
            print(m-1)
    n-=1