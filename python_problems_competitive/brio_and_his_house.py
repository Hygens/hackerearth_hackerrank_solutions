from decimal import *
m=10**9+9
T=int(raw_input())
while T>0:
    N=int(raw_input())
    if (N%2!=0): p=(N+1)/2
    else: p=N/2
    print pow(26,p,m)
    T-=1







