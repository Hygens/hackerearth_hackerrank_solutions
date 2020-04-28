n = int(input().strip())
from collections import Counter
dom = Counter()
for i in range(n):
    dom[input().strip()] += 1
r = 0
for i in range(n):
    s = input().strip()
    if dom[s] > 0:
        dom[s] -= 1
        r += 1
print (r)