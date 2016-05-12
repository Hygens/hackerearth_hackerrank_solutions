T=int(raw_input())
while T>0:
    A,B,M=map(long,raw_input().split())
    r=len([x for x in range(A,B+1) if x%M==0])    
    print(r)
    T-=1
    
