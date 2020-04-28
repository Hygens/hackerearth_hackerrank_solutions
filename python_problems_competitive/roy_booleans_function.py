from fractions import gcd
def primes(n,k): 
    return gcd(n,k)==1
T=int(raw_input())
while (T>0):
    N=int(raw_input())
    l=filter(lambda x: primes(N,x),range(1,N))
    z=len(l)
    if z==1: r=False
    elif z==2: r=True
    else: r= gcd(z,2)==1
    if r==True: print("TRUE")
    else: print("FALSE")
    T-=1
