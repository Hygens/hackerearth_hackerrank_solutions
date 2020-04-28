import sys
M=10**9+7
n = int(sys.stdin.readline().strip())
while n>0:
    s = sys.stdin.readline().strip()
    print(len(set(s))%M)
    n-=1
        