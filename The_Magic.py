import sys
from math import log
def days(n,acc=0):
    if n==0: return acc 
    else:
        acc+=1
        n -= 2**(int(log(n,2)))
    return days(n,acc)
T=int(sys.stdin.readline())
while T>0:
    n = int(sys.stdin.readline())
    if n==1: print(1)
    else: print(days(n))
    T-=1