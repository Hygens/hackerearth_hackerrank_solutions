from sys import stdin,stdout
from bisect import bisect_left
primes=[67,71,73,79,83,89,97,101,103,107,109,113]
t = int(stdin.readline().strip())
for _ in range(t):
    n = int(stdin.readline().strip())
    s = stdin.readline().strip()
    res = ''
    for i in range(n):
        c = ord(s[i])
        idx = bisect_left(primes,c)        
        if idx==-1: res+=primes[-1]
        elif idx<len(primes) and abs(primes[idx]-c)<abs(primes[idx-1]-c): res+=chr(primes[idx])
        else: res+=chr(primes[idx-1])    
    stdout.write(res+'\n')
    
    


