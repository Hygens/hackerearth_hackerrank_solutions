import sys
import re
t=int(sys.stdin.readline().strip())
while t>0:
    s=''.join(set(sys.stdin.readline().strip()))
    r=re.findall('[abcdefghijklmnopqrstuvwxyz]',s)
    if len(r)==26: print('YES')
    else: print('NO')
    t-=1
    