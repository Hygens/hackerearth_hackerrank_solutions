from decimal import Decimal
T=int(raw_input())
while T>0:
    N,M=map(Decimal,raw_input().split())
    if (N==M) or (N>1 and M>1 and (N/M==M or M/N==N)): print ('YES')
    else: print ('NO')
    T-=1