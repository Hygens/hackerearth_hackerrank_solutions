from itertools import combinations
from math import log
T = int(raw_input())
lg=0.0 ; lgi=0
while(T>0):
    N=int(raw_input())
    L = map(int, raw_input().split())
    C = sum([map(list,combinations(L,x)) for x in range(N+1)],[])
    res="NO"
    for S in C[1:]:
        r=reduce(lambda x,y: x&y,S) 
        if(r==0): continue
        else: lg=log(r,2) ; lgi=round(lg)
        if (lg-lgi==0): res="YES" ; break
    print(res)   
    T-=1