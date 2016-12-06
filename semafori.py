from sys import stdin,stdout
n, l = map(int, stdin.readline().strip().split(' '))
pos = 0
res = 0
for i in range(n):
    d, r, g = map(int, stdin.readline().strip().split(' '))
    res += d-pos
    pos = d
    aux = res % (r+g)
    if aux < r:
        res+= r-aux
stdout.write(str(res+(l-pos))+'\n')