from decimal import *
Q=int(raw_input())
X=0
while Q>0:
    N,T=map(int,raw_input().split()) ; X=N
    for i in range(T):
        if X%2==0: X=X/2 ; X=X-X//4
        else: X=X-(X+1)//2 ; X=X-X//4
    print(X)
    Q-=1