import sys
T=int(sys.stdin.readline())
while T>0:
    n = int(sys.stdin.readline())
    arr = sys.stdin.readline().strip().split(' ')
    print(' '.join(sorted(arr,key=lambda x:bin(int(x)).count("1"))))
    T-=1