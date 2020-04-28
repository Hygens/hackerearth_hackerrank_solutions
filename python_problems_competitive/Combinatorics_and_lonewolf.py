import sys
t=int(sys.stdin.readline().strip())
while t>0:
    n=int(sys.stdin.readline().strip())
    if n==1: print(1)
    elif n==2: print(3)
    elif n==3: print(7)
    else: print((2**n-1)%1073741824)
    t-=1