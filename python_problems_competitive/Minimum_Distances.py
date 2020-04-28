import sys
from collections import Counter
n = int(sys.stdin.readline().strip())
a = sys.stdin.readline().strip().split(" ")
d = []
for k,v in Counter(a).items():
    i=0 ; j=0
    if v>1:
        i=a.index(k)
        j=a.index(k,i+1)
        if i>=0 and j>0:
            d.append(j-i)
if d: print(min(d))
else: print(-1)
        
         
