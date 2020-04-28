from Crypto.Util.number import isPrime
from math import log
from fractions import gcd
def f(x,m): return m**x
T = int(raw_input())   
for _ in range(T):
    N, M = list(map(long, raw_input().split()))
    r=0
    if (N<M): r=N
    elif (N==M): r=1
    elif (N!=1 and M!=1) and (isPrime(M) or isPrime(M/2) or gcd(N,M)==1 or 
         isPrime(M/gcd(N,M)) or gcd(N/gcd(N,M),M/gcd(N,M))==1):
        expt = int(log(N,M))
        if (M**expt<N): r+=1
        t=N-M**expt
        expts=[]
        if (t>M): 
            while (True):
                expts.append(int(log(t,M)))
                t=t-M**expts[-1]
                if (t<M): r+=len(expts); break
        sub=sum([M**x for x in expts])                    
        k=(N-M**expt-sub)%M
        if (k<M): r+=k
    elif (N%M==0): r=N/M
    elif (N%M!=0): r=N/M+N%M    
    print(r)