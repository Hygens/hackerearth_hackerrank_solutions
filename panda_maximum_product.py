# from bigfloat import * 
from decimal import Decimal
T = int(raw_input())
l = map(int,raw_input().split())
l = [x for x in l if x != 0]
if l: x=max(l)
else: x=0
if (l) and (x<0):
    x=min(l)
    l.remove(x)
elif (l) and (x>0):
    l.remove(x)
if l: y=max(l)
else: y=0
if (l) and (y<0):
    y=min(l)    
print(Decimal(x*y))


