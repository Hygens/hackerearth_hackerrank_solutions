import sys
from itertools import combinations
t=int(sys.stdin.readline().strip())
l = []
r = []
res = 0
while t>0:
    s,e = sys.stdin.readline().strip().split('-')
    l.append(sorted([int(s.replace(':','')),int(e.replace(':',''))]))
    if l>1:
        l = sorted(l)
        r = filter(lambda (x,y): x[1]>y[0],combinations(l,2))
        if len(r)>0: 
            res = 1
            break
    t-=1
if res==1: print('Will need a moderator!')
else: print('Who needs a moderator?')
            