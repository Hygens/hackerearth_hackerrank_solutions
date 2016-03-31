# from bigfloat import * 
from decimal import *

facts=[1,1,2,6,24,120,720,5040,40320,362880]

def range_prod(lo, hi):
    if lo + 1 < hi:
        mid = (hi + lo) // 2
        return(range_prod(lo, mid) * range_prod(mid + 1, hi))
    if lo == hi:
        return(lo)
    return(lo * hi)

def factorial_tree(n):
    if n < 2:
        return(1)
    return(range_prod(1, n))

T = int(raw_input())
while(T > 0):
    x, y = map(int, raw_input().split())
    if (x==0): 
        a=1        
    elif (x==1 or x==2): a=x
    elif x<=6: 
        a = factorial_tree(facts[x])        
    b = pow(10, y)
    if (x>6):
        print(0)
    else:
        print(a%b)
    T -= 1
