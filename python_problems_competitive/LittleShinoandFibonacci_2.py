from decimal import Decimal,getcontext
import sys
sys.setrecursionlimit(10000000)
getcontext().prec=10**1000
M = 1000000007
def fibSum2(n):
    v1, v2, v3 = Decimal(1), Decimal(1), Decimal(0)   
    if n==0 or n==1: return 0
    elif n==2: return 1
    else:
        n+=1
        for rec in bin(n)[3:]:  
            calc = v2*v2
            v1, v2, v3 = Decimal(v1*v1+calc), Decimal((v1+v3)*v2), Decimal(calc+v3*v3)
            if rec=='1':    v1, v2, v3 = v1+v2, v1, v2
        return v2-1   
    
n = int(sys.stdin.readline().strip())
while n>0:
    l,r = map(long,sys.stdin.readline().strip().split(' '))
    s1 = fibSum2(l-1)    
    s2 = fibSum2(r)  
    s = (s2-s1)%10000
    print(s%M)
    n-=1