import sys
from itertools import * 
def grouper(iterable):
    return [[iterable[x],iterable[x+1]] for x in range(0,len(iterable),2)]
def f(tpl):
    if tpl[0][1]>tpl[1][1]: return (tpl[0][0],tpl[0][1])
    else: return (tpl[1][0],tpl[1][1])
n,q = map(int,sys.stdin.readline().strip().split(' '))
fighters = map(long,sys.stdin.readline().strip().split(' '))
d = dict((e,0) for e in range(1,len(fighters)+1))
if len(fighters)>1:
    l = map(lambda (k,v): (k+1,v),enumerate(fighters))
    while not len(l)==1:
        if len(l)%2!=0:
            temp = l[-1]
            for t in l[:-1]: d[t[0]]+=1
            l = map(lambda (x,y): f((x,y)),grouper(l[:-1]))                               
            l.append(temp)           
        else:
            for u in l: d[u[0]]+=1
            l = map(lambda (x,y): f((x,y)),grouper(l))     
    while q>0:
        Q = int(sys.stdin.readline().strip())
        if d.has_key(Q): print(d[Q])
        else: print(0)
        q-=1
else: 
    while q>0:
        Q = int(sys.stdin.readline().strip())
        if d.has_key(Q): print(d[Q])
        else: print(0)
        q-=1