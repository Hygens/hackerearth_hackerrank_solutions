import sys
import re
from collections import Counter
from collections import defaultdict
t = int(sys.stdin.readline().strip())
d = defaultdict(int)
while t>0:
    s = sys.stdin.readline().strip()
    G = re.findall('[G]',s)
    M = re.findall('[M]',s)
    dt= Counter(re.findall('(\d\d)+',s))
    if len(dt)>0:
        if len(G)>0: 
            for k,v in dt.items():
                d[int(k)]+=v*2
        elif len(M)>0:
            for k,v in dt.items():
                d[int(k)]+=v
    t-=1
if len(d)>0:
    max_19 = d[19]
    max_20 = d[20]
    max_others = max(filter(lambda x: not x in [max_19,max_20],d.values()))
    if max_19>max_others or max_20>max_others: print('Date')
    else: print('No Date')
else: print('No Date')