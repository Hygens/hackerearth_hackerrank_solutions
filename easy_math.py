import sys
from collections import Counter
import re
regex = '^[4]*[0]+$'
t=int(sys.stdin.readline())
while t>0:
    x = long(sys.stdin.readline().strip())
    k = 1
    y = 1
    while not re.findall(regex,str(k)):
        k=x*y
        if k==4: break
        y+=1
    d = Counter(str(k)) 
    a = int(d['4']) ; b = int(d['0'])
    print(2*a+b)
    t-=1