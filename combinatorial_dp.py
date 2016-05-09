from functools import wraps
def memo(func):
    cache = {} # Stored subproblem solutions
    @wraps(func) # Make wrap look like func
    def wrap(*args): # The memoized wrapper
        if args not in cache: # Not already computed?
            cache[args] = func(*args) # Compute & cache the solution
        return cache[args] # Return the cached solution
    return wrap # Return the wrapper
@memo
def C(n,k):
    if k == 0: return 1
    if n == 0: return 0
    return C(n-1,k-1) + C(n-1,k)
T=int(raw_input())
while T>0:
    N,K=map(int,raw_input().strip().split(' '))
    print(C(N,K))
    T-=1