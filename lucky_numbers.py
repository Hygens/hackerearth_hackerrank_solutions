from Crypto.Util.number import isPrime
T=int(input())
while T>0:    
    A,B=map(int,input().split())
    s=0
    for x in range(A,B+1):        
        l=map(int,str(x)) ; summing=sum(l) ; producting=sum([i*i for i in l])
        if isPrime(summing) and isPrime(producting):
            s+=1        
    print(s)        
    T-=1