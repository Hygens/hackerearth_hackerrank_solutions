import sys
from decimal import Decimal
import itertools
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
def primes_up_to(start,limit):
    return list(itertools.takewhile(lambda p: p>=start and p <= limit, primes()))
t=int(sys.stdin.readline().strip())
while t>0:
    x,y=map(int,sys.stdin.readline().strip().split(' '))
    p = primes_up_to(x,y)
    print(p)
    print(sum(p))
    t-=1