from decimal import Decimal
T=int(input())
while T>0:
    N,M=map(Decimal,input().split())    
    if (N==M): print ('YES')
    elif (N==2 and M==4) or (N==4 and M==2): print('YES')
    else: print ('NO')
    T-=1
