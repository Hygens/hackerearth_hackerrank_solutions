import sys
import numpy as np
t=int(sys.stdin.readline().strip())
a=map(long,sys.stdin.readline().strip().split(' '))
a=np.asarray(np.cumsum(a))
q=int(sys.stdin.readline().strip())
while q>0:
    n = int(sys.stdin.readline())
    key = 0
    en = enumerate(a)
    for (k,v) in [(k,v) for k,v in en if v>=n]:
        key = k+1
        break  
    if key>0: print(key)  
    else: print(-1)
    q-=1