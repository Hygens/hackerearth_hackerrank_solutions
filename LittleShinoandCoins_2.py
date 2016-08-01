import sys
from collections import Counter
k = long(sys.stdin.readline().strip())
s = sys.stdin.readline().strip()
size = long(len(s))
c = Counter(s)
print(k*len(filter(lambda x: x>1,c.values())))
