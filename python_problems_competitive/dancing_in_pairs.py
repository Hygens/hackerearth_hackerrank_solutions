import sys
from math import sqrt,floor
from decimal import Decimal
t=int(sys.stdin.readline())
while t>0:
    n=Decimal(sys.stdin.readline())
    s=Decimal(floor(sqrt(n)))
    if ((s**2)>n): s-=1
    if (s%2==1): print('odd')
    else: print('even')
    t-=1