import sys
import operator as op
from math import factorial as fact
from collections import Counter
def nCr(n, r):
    r = min(r, n-r)
    if r == 0: return 1
    numer = reduce(op.mul, xrange(n, n-r, -1))
    denom = reduce(op.mul, xrange(1, r+1))
    return numer//denom
k = long(sys.stdin.readline().strip())
s = sys.stdin.readline().strip()
size = len(s)
sizeu = len(set(s))
d = Counter(s)
rep = 1
for k,v in d.items():
    if v>1:  rep*=fact(v-1)
if k==1 and size==1: print(1)
elif k==1 and size>1: print(size-sizeu)
elif k==size and size==sizeu: print(1)
elif k==size and size!=sizeu: print(0)
else: print(nCr(size,k)//rep)


