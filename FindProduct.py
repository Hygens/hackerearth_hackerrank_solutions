import sys
from decimal import *
M=10**9+7
N=int(sys.stdin.readline())
a=map(int,sys.stdin.readline().split())
answer=reduce(lambda x,y: (x*y)%M,a)
print answer