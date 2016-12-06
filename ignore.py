b = ['0','1','2','5','9','8','6']
from sys import stdin,stdout
l = stdin.readline().strip()
while l:
    try:
        n = int(l)
        res = ''
        while n:
            n, r = n//7, n%7
            res+=b[r]
        stdout.write(str(res)+'\n')
        l = stdin.readline().strip()
    except (EOFError):
        break