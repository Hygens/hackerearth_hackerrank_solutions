#!/usr/bin/python3
import string
xs = list(map(int,input().split()))
ys = map(list,filter(lambda p: p[0] != 0, zip(xs, string.ascii_lowercase)))
ys = list(sorted(ys))
c = ys[0][1]
ys[0][0] -= 1
if ys[0][0] == 0:
    del ys[0]
ys = list(sorted(ys, key=lambda p: p[1]))
s = [c]
while ys:
    i = 0
    if len(s) >= 2 and len(ys) >= 2 and s[0] == s[1] == s[-1] == c == ys[i][1]:
        i = 1
    s.append(ys[i][1])
    ys[i][0] -= 1
    if ys[i][0] == 0:
        del ys[i]
print(*s, sep='')