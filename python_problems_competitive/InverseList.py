import sys
t=int(sys.stdin.readline().strip())
while t>0:
    n = int(sys.stdin.readline().strip())
    a = map(int,sys.stdin.readline().strip().split(' '))
    b = [0]*n
    for x in a:
        b[a[x-1]-1]=x
    if a==b: print('inverse')
    else: print('not inverse')
    t-=1