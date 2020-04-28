import sys
n = int(sys.stdin.readline())
s = []
for _ in range(n):
    x = sys.stdin.readline().strip()
    if x=='0' and len(s)>=1: del s[-1]
    elif int(x)>0: s.append(x)
suma = sum(map(int,s))
print(suma)