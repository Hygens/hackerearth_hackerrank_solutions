import sys
from fractions import gcd
T=int(sys.stdin.readline())
while T>0:    
    a,d = map(long,sys.stdin.readline().split(' '))   
    p = long(sys.stdin.readline())
    n = 0
    for i in xrange(1,10**18+1):
        n = d*i-(d-a)
        if gcd(n,p)==p: 
            n = i-1
            break            
    print('%.f' %(n))
    T-=1
