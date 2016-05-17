from Crypto.Util.number import isPrime
from functools import wraps
#decorator memorization
def memo(func):
    cache = {} 
    @wraps(func) 
    def wrap(*args): 
        if args not in cache: 
            cache[args] = func(*args) 
        return cache[args] 
    return wrap 
@memo
def sum_of_squares_of_digits(value):
    return isPrime(sum([int(c)**2 for c in str(value)]))
@memo
def sum_list(value):
    return isPrime(sum(map(int,str(value))))    
T=int(raw_input())
while T>0:    
    A,B=map(long,raw_input().split())
    s=0
    for x in xrange(A,B+1):        
        if sum_list(x):
            if sum_of_squares_of_digits(x):
                s+=1        
    print(s)        
    T-=1
    
