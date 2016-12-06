from operator import mul
from math import log
from _functools import reduce
from operator import itemgetter
from collections import OrderedDict

def calc(s):
    res = 0
    if s.find('^')>=0: 
        l = list(map(int,s.split('^')))[::-1]
        res = reduce(mul,l[1:])
        res*= log(l[0])
    else:
        res = log(int(s))
    return res

m=input().strip()
case=1
while m!='':
    try:
        n = int(m)
        d = OrderedDict()
        for _ in range(n):
            v = input().strip()
            d[v]=calc(v)        
        d = sorted(d.items(), key=itemgetter(1))        
        print('Case %i:' %(case))    
        for (key, value) in d:
            print(key)
        m=input().strip()
        case+=1
    except (EOFError):
        break   
