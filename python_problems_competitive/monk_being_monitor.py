from sys import stdin,stdout
from collections import Counter
t = int(stdin.readline().strip())
for _ in range(t):
    n = int(stdin.readline().strip())
    d = Counter([int(x) for x in stdin.readline().split(' ')])
    l = sorted(d.items(), key=lambda x: x[1])
    stdout.write(str(l[-1][1]-l[0][1])+'\n')
    
