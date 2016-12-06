from sys import stdin,stdout
n, k = map(int, stdin.readline().split(' '))
if k > n // 2:
    k = n - k
l = sorted(map(int, stdin.readline().split(' ')))
r = [[float('inf') for i in range(n + 1)] for j in range(n + 1)]
r[0][0] = 0
for i in range(0, n): 
    for j in range(0, i + 1):
        if j > k or i - j > n - k:
            continue
        li = r[i][j] + l[i] * (i - j - (n - k - (i - j)))
        lu = r[i][j] + l[i] * (j - (k - j))
        if r[i + 1][j + 1] > li:
            r[i + 1][j + 1] = li
        if r[i + 1][j] > lu:
            r[i + 1][j] = lu
stdout.write(str(r[n][k]))