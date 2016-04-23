from decimal import Decimal
T=int(raw_input())
while T>0:    
    N=Decimal(raw_input())
    s=0
    for i in range(N+1):
        if bin(i).count("1")==2: s=Decimal(s)+Decimal(i)
    print(s)    
    T-=1