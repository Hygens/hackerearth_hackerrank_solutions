from sys import stdin,stdout
import operator as op
from functools import reduce

def ncr(n, r):
    r = min(r, n-r)
    if r == 0: return 1
    numer = reduce(op.mul, range(n, n-r, -1))
    denom = reduce(op.mul, range(1, r+1))
    return numer//denom

r,s = list(map(int, stdin.readline().strip().split(' ')))
np = r*s
st = ''
while r>0:
    st += stdin.readline().strip()
    r-=1
ac=list(st).count('o')
if ac==0 or ac==1: stdout.write('0\n')
elif ac==2: stdout.write('2\n')
else:
    if ac>8: ac=8
    res = ncr(ac,2)
    stdout.write(str(res)+'\n')
    
    
    

    