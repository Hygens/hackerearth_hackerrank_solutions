import sys
from collections import deque
def computeMin(seq,n,d):
    dq = deque(seq[:d]) 
    minx = [] ; minx.append(max(dq))    
    for i in range(d,n):
        dq.appendleft(seq[i]) ; dq.pop()
        minx.append(max(dq))       
    return min(minx)
n,q=map(int,sys.stdin.readline().split(' '))
a=list(map(int,sys.stdin.readline().split(' ')))
while q>0:
    i = int(sys.stdin.readline())
    if int(i)==1: print(min(a))
    else: print(computeMin(a,n,i))
    q-=1