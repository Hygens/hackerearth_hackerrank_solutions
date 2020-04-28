from collections import defaultdict
from sys import stdin,stdout
l = defaultdict(int)
st = stdin.readline().strip().strip()
for ch in st:
    l[ch]+=1
odds = len([x for x in l.values() if x%2])
if odds:
    stdout.write(str(odds - 1)+'\n')
else:
    stdout.write('0\n')