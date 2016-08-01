import sys
import re
sys.setrecursionlimit(100000000)
def ncoins(m, V):
    if V == 0: return 0 
    res = long(sys.maxsize)
    for i in range(m):
        if di[i] <= V:
            sub_res = ncoins(m, V-di[i])
            if sub_res != long(sys.maxsize) and sub_res + 1 < res:
                res = sub_res + 1
    return res

n,q = map(int,sys.stdin.readline().strip().split(' '))
di = map(long,re.split(r'[\s]+', sys.stdin.readline().strip()))
di = sorted(di)
divn = 0
while q>0:
    xi = long(sys.stdin.readline().strip())
    divn = ncoins(di,n,xi)
    if divn>0 and divn<long(sys.maxsize): print('YES')
    else: print('NO')
    q-=1
    
