import sys
import operator as op
M=10**9+7
def ncr(n, r):
    r = min(r, n-r)
    if r == 0: return 1
    numer = reduce(op.mul, xrange(n, n-r, -1))
    denom = reduce(op.mul, xrange(1, r+1))
    return numer//denom
p = int(sys.stdin.readline().strip())
while p>0:
    m,n = map(int,sys.stdin.readline().strip().split(' '))
    k = n
    if (m-n>1):
        print(((m+1-k)*(n**(m-k))-(m-k-1))%M)
    else:
        print((ncr(n,m+1-k)*(n**(m-k))-(m-k-1))%M)
    p-=1