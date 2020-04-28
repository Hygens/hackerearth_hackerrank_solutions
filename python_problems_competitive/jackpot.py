from fractions import gcd
from functools import reduce
def lcm(a,b):
    return (a*b)//gcd(a,b)
def lcmm(*args):
    return reduce(lcm, args)
n = int(input().strip())
for i in range(n):
    m = int(input().strip())
    M = map(int, input().strip().split(' '))
    r = lcmm(*M)
    if r > 1000000000:
        print ('More than a billion.')
    else:
        print (r)