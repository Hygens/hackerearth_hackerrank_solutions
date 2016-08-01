import sys
from Crypto.Util.number import isPrime
def univ(n):
    x = map(int,list(str(n)))
    size = len(x)
    x = map(lambda (k,v): v*(10**(size-(k+1))),enumerate(x))
    s = sum(x)
    if isPrime(s):
        if s%size==rems[size-1]: return True
        else: return False
    else: return False
    
rems = map(long,sys.stdin.readline().strip().split(' '))
n = int(sys.stdin.readline().strip())
while n>0:
    a,b = map(long,sys.stdin.readline().strip().split(' '))
    suma = 0
    for x in [y for y in xrange(a,b+1,2) if isPrime(y)]:
        if univ(x): suma+=1 
    print(suma)        
    n-=1
    
