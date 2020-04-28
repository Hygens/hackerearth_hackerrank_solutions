from sys import stdin,stdout
n = int(stdin.readline().strip())
vs = sorted([int(x) for x in stdin.readline().strip().split(' ')])
ps = sorted([int(x) for x in stdin.readline().strip().split(' ')])
can = True
for i in range(n):
    if vs[i] < ps[i]:
        can = False
        break
stdout.write("Yes\n" if can else "No\n")
