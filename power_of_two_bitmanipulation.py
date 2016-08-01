from math import log
import sys
from itertools import combinations
T = int(sys.stdin.readline().strip())
while(T>0):
    N=int(sys.stdin.readline().strip())
    L = set(map(long, sys.stdin.readline().strip().split(' ')))
    if N==1: print("NO")
    else:
        sim = False
        for x in combinations(L,2):
            r = x[0]&x[1]
            if r>0 and log(r,2).is_integer(): sim=True ; break
        if sim: print("YES") 
        else: print("NO")
    T-=1