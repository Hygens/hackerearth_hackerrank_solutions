import sys
from itertools import combinations_with_replacement
from fractions import gcd
T=int(sys.stdin.readline())
while T>0:    
    n=long(sys.stdin.readline().strip())   
    s = 0
    for i,j in combinations_with_replacement(xrange(1,n+1),2):
         if gcd(i,j)==1: s+=1
    print(s)
    T-=1
