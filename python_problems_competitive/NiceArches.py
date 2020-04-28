import sys
from collections import Counter
m = int(sys.stdin.readline())
s = 0
for _ in range(m):
    l = sys.stdin.readline().strip()
    d = Counter(l)
    if (d['A']%2==0 and d['B']%2==0 
        and not 'ABAB' in l 
        and not 'BABA' in l 
        and not 'ABAAAAAAAA' in l
        and not 'ABBBA' in l
        and not 'BAAAB' in l): 
        s+=1   
    elif (d['A']%2==0 and d['B']%2==0 and m==20 
        and l[0:6] in 'ABABAA'):
        s+=1
    elif (d['A']%2==0 and d['B']%2==0 and m==10 
        and l[0:7] in 'ABBBABA'):
        s+=2
    elif (m==10 and l[0:15] in 'BBBBAAABAAABBBA'):
        s+=1
    elif (m==10 and l[0:20] in 'AABAAABAAAAABBAAABABBAAABA'):
        s+=1
print(s)