from fractions import gcd
from functools import reduce
from math import sqrt,fmod
M = 1000000007
def modExp(x,n,M):
    if n == 0:  return 1
    elif n%2==0: return modExp(fmod((x*x),M),  n//2, M)
    else: return fmod(x * modExp(fmod((x*x),M),  n//2, M),M)
    
def fib(n):
    sq5 = sqrt(5)
    Phi = (1 + sq5) / 2
    phi = (1 - sq5) / 2
    binet = 0
    if n%2 == 0: binet = (1/sq5)*(fmod(modExp(Phi,n,M)-modExp(phi,n,M),M))
    else: binet = (1/sq5)*(fmod(modExp(Phi,n,M)+modExp(abs(phi),n,M),M))
    return round(binet)

def lcm(x,y):
    k=gcd(x,y) 
    if x>y: x//=k
    else: y//=k
    return x*y

def lcmArr(numbers):
    return reduce(lcm, numbers)

n = int(input().strip())
l = [fib(int(input().strip())) for _ in range(n)]
print(lcmArr(l)%M)