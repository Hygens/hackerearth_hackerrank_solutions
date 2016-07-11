import sys
n = int(sys.stdin.readline().strip())
m = []
for i in range(1,n+1):
    a,b = map(int,sys.stdin.readline().strip().split(' '))
    m.append([a+b,i])
m = sorted(m,key=lambda x: x[0])
ss = []
for x in m:
    ss.append(str(x[1]))
print(' '.join(ss))
