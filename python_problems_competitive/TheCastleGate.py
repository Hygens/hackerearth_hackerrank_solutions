import sys
from itertools import combinations
t=int(sys.stdin.readline().strip())
while t>0:
    n=int(sys.stdin.readline().strip())
    print(len(filter(lambda (x,y): x^y<=n,combinations(range(1,n+1),2))))
    t-=1