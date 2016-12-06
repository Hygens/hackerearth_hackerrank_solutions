from sys import stdin,stdout
from functools import wraps
M=1000000007
def memo(func):
    cache = {} 
    @wraps(func) 
    def wrap(*args): 
        if args not in cache: 
            cache[args] = func(*args) 
        return cache[args] 
    return wrap
def lcs(a,b): 
    @memo 
    def L(i,j): 
        if min(i,j) < 0: return 0 
        if a[i] == b[j]: return 1 + L(i-1,j-1) 
        return max(L(i-1,j), L(i,j-1))
    return L(len(a)-1,len(b)-1) 
def substrs(s):
    r = 0
    for i in range(1,len(s)+1):
        for j in range(i):
            r+=lcs(s[j:i],s)
            r%=M
    return r

T = int(stdin.readline().strip())
for _ in range(T):
    stdout.write(str(substrs(stdin.readline().strip()))+'\n')
    

 