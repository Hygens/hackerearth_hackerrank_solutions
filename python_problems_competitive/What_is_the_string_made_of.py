import sys
from collections import Counter
d = {'0':6,'1':2,'2':5,'3':5,'4':4,'5':5,'6':6,'7':3,'8':7,'9':6}
s=list(sys.stdin.readline().strip())
c = Counter(s)
s = 0
for (idx,v) in c.items():
    s += d[idx]*v    
print(s)
    