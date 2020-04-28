from functools import wraps
import sys
sys.setrecursionlimit(1000000)
def memo(func):
    cache = {} 
    @wraps(func) 
    def wrap(*args): 
        if args not in cache: 
            cache[args] = func(*args) 
        return cache[args] 
    return wrap 
@memo
def fib(i):
    if i == 0: return 1
    elif i == 1: return 2
    else: return fib(i-1) + fib(i-2)
t=input().strip()
while t:
    try:
        N=int(t)
        print(fib(N))
        t=input().strip()
    except (EOFError):
        break
    