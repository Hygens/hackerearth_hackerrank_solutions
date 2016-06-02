import sys
import re
from collections import OrderedDict
n=int(sys.stdin.readline().strip())
mstreak = []
nstreak = 0
d = OrderedDict()
for k in range(1,n+1):
    s=sys.stdin.readline().strip()
    e = []    
    for (x,y) in [(a.start(), a.end()) for a in list(re.finditer('[C]+', s))]:
        e.append(y-x)
        ant = k-1
        if y==len(s): 
            key=k
            d.setdefault(key,{'start':0,'end':0}) 
            d[key]['end']=y-x        
        if (x==0): 
            key=k 
            d.setdefault(key,{'start':0,'end':0})
            d[key]['start']=y-x
    mstreak.append(max(e))
o = d.values() 
for dx in xrange(1,len(o),2):
    v = o[dx-1]['end']+o[dx]['start']
    if v>max(mstreak): 
        nstreak = v 
        break       
if nstreak==0: nstreak = max(mstreak)   
print(str(max(mstreak))+" "+str(nstreak))
    