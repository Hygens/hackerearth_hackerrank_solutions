from itertools import combinations
from numpy import product
from operator import mul,add
import sys
from decimal import Decimal
from math import fmod
T=int(sys.stdin.readline())
M=10**9+7
for i in range(T):
    N=int(sys.stdin.readline())
    L=map(Decimal, sys.stdin.readline().split())
    if len(L)==2: 
        A=L
        res=(product(L)/sum(L))%M
    else: 
        A=sum([map(list,combinations(L,x)) for x in range(2,N+1)],[])[1:]
        R=map(lambda x:fmod(product(x)/sum(x),M),A)
        print(R)
        res=max(R)
    print("Case #"+str(i+1)+": "+"%.f"%(res))
    T-=1
