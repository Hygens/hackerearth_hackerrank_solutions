import sys
from Crypto.Util.number import isPrime
from itertools import combinations,permutations
t=int(sys.stdin.readline().strip())
while t>0:
    n,m = map(int,sys.stdin.readline().strip().split(' '))
    v = map(int,sys.stdin.readline().strip().split(' '))
    v = filter(lambda x: not isPrime(x),v)
    c = []
    if m in v:        
        c = map(list,combinations(v,n))
    else:
        v.append(m)
        c = map(list,permutations(v,n))        
    print(len(c))
    t-=1
    