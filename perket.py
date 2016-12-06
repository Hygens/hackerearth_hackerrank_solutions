from itertools import combinations
from sys import stdin,stdout
from functools import reduce
n = int(stdin.readline().strip())
vals = []
for _ in range(n):
    s, b = map(int, stdin.readline().strip().split(' '))
    vals.append((s,b))
nt = 0x7FFFFFFF
for i in range(len(vals)):
    iters = combinations(vals, i+1)
    for s in iters:
        tot = reduce((lambda t1, t2: (t1[0]*t2[0], t1[1]+t2[1])), s)
        tot = abs(tot[0]-tot[1])
        if tot < nt:
            nt = tot
stdout.write(str(nt)+'\n')