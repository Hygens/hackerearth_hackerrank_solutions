import sys
n,k = map(int,sys.stdin.readline().strip().split(' '))
c = map(int,sys.stdin.readline().strip().split(' '))
c.sort(reverse = True)
s = 0
for i in range(n):
    x = int(i/k)
    s += c[i]*(x+1)
print(s)