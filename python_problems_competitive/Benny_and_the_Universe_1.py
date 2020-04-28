import sys
import re
def comb2(S, m, n):
    table = [0]*(n+1)   
    table[0] = 1
    for i in range(m):
        for j in xrange(S[i],n+1):
            table[j] += table[j-S[i]]
    return table[n]

n,q = map(int,sys.stdin.readline().strip().split(' '))
di = map(long,re.split(r'[\s]+', sys.stdin.readline().strip()))
di = sorted(di)
divn = 0
while q>0:
    xi = long(sys.stdin.readline().strip())
    divn = comb2(di,n,xi)
    if divn>0: print('YES')
    else: print('NO')    
    q-=1
    
