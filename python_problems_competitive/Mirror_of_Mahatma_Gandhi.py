import sys
import re
t = int(sys.stdin.readline().strip())
while t>0:
    s = sys.stdin.readline().strip()
    palindromo = s==s[::-1]
    all_mirror = len(s)==len(re.findall('[180]',s))
    if palindromo and all_mirror: print('YES')
    else: print('NO')
    t-=1