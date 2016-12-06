import sys
import operator as op
from functools import reduce
from math import factorial as fact
from collections import Counter
def nCr(n, r):
    r = min(r, n-r)
    if r == 0: return 1
    numer = reduce(op.mul, list(range(n, n-r, -1)))
    denom = reduce(op.mul, list(range(1, r+1)))
    return numer//denom
k = int(sys.stdin.readline().strip())
s = sys.stdin.readline().strip()
size = len(s)
sizeu = len(set(s))
d = Counter(s)
rep = 0
for y,v in d.items():
    if v>1:  rep+=v-1
if k==1 and size==1: print(1)
else: 
    ncr = nCr(size,k)
    print(ncr//rep)


