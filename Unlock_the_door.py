import sys
m = 1000000007
def range_prod(lo,hi):
    if lo+1 < hi:
        mid = (hi+lo)//2
        return range_prod(lo,mid) * range_prod(mid+1,hi)
    if lo == hi:
        return lo
    return lo*hi
def fact(n):
    if n < 2:
        return 1
    return range_prod(1,n)
t=int(sys.stdin.readline().strip())
while t>0:
    n,k=map(long,sys.stdin.readline().strip().split(' '))
    if n==1: print(k)
    elif n==k: print((k*(k+1)/2)%m)
    else:
        v = fact(k)/fact(k-n)
        print(v%m)
    t-=1