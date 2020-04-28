import sys
T=int(sys.stdin.readline().strip())
l = []
while T>0:
    n,k = map(int,sys.stdin.readline().strip().split(' '))
    a = map(lambda x: bin(int(x)).count("1"),sys.stdin.readline().strip().split(' '))
    a = sorted(a,reverse=True)
    print(sum(a[0:k]))
    T-=1