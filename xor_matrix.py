from sys import stdin 
from itertools import tee   

def pairwise(iterable):    
    a, b = tee(iterable)
    next(b, None)
    return zip(a, b)
    
def pairwise_xor(xs):
    return [x^y for x,y in pairwise(xs)]+[xs[-1]^xs[0]]

n,m = map(int,stdin.readline().split(' '))
a = list(map(int,stdin.readline().split(' ')))
for _ in range(m-1): a = pairwise_xor(a)
print(' '.join(map(str,a)))
        
