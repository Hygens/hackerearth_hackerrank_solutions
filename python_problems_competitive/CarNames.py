import sys
from collections import Counter
T=int(sys.stdin.readline().strip())
while T>0:    
    name=sys.stdin.readline().strip()
    c = Counter(name)
    size = len(c)
    f = list(set(c.values()))
    s = ''
    if size==3 and len(f)==1 and not name=='carcar': print('OK')  
    else: print('Not OK')  
    T-=1