import sys
from decimal import *
def uniqueDigit(n):
    if len(str(n))==1: 
        return n
    else:
        n = sum(map(Decimal,list(str(n))))
        return uniqueDigit(n)
t=int(sys.stdin.readline().strip())
while t>0:
    m = int(sys.stdin.readline().strip())
    s = Decimal(0)
    while m>0:
        l,d = map(Decimal,sys.stdin.readline().strip().split(' '))
        s += l*d
        m-=1
    print(uniqueDigit(s))
    t-=1
    
        
     
    
    
    