r,c = map(int,input().split(' '))
l = []
for i in range(r):
    l.append(list(input().strip()))
n = int(input().strip())
for _ in range(n):
    r1,c1,r2,c2 = map(int,input().split(' '))
    if l[r1-1][c1-1]==l[r2-1][c2-1]=='0': print('binary')
    elif l[r1-1][c1-1]==l[r2-1][c2-1]=='1': print('decimal')
    else: print('neither')