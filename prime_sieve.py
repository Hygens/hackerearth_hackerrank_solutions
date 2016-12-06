from itertools import takewhile
try:
    from Crypto.PublicKey import _fastmath
except ImportError:
    _fastmath = None
def primes():
    yield 2; yield 3; yield 5; yield 7;
    bps = (p for p in primes())             
    p = next(bps) and next(bps)             
    q = p * p                               
    sieve = {}                              
    n = 9                                   
    while True:
        if n not in sieve:                  
            if n < q:                       
                yield n                     
            else:
                p2 = p + p                  
                sieve[q + p2] = p2          
                p = next(bps); q = p * p    
        else:
            s = sieve.pop(n); nxt = n + s   
            while nxt in sieve: nxt += s    
            sieve[nxt] = s                  
        n += 2   
                                  
def primes_up_to(limit):
    return len(list(takewhile(lambda p: p<= limit, primes())))

def isPrime(N):    
    if N == 1:
        return 0
    if N in sieve:
        return 1
    for i in sieve:
        if (N % i)==0:
            return 0    
    if _fastmath is not None:
        return 1 if _fastmath.isPrime(N) else 0
    N1 = N - 1
    n = 1
    while (n<N):
        n=n<<1
    n = n >> 1  
    for c in sieve[:7]:
        a=int(c) ; d=1 ; t=n
        while (t):  
            x=(d*d) % N
            if x==1 and d!=1 and d!=N1:
                return 0  
            if N1 & t:
                d=(x*a) % N
            else:
                d=x
            t = t >> 1
        if d!=1:
            return 0
    return 1

sieve=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
       61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127,
       131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193,
       197, 199, 211, 223, 227, 229, 233, 239, 241, 251]

n,q = map(int,input().strip().split(' '))
print(primes_up_to(n))
for _ in range(q):
    print(isPrime(int(input().strip())))