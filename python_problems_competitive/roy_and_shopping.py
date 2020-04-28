import sys
from collections import defaultdict
from math import sqrt,floor
# def factor(n):
#     i = 2
#     limit = sqrt(n)    
#     while i <= limit:
#         if n % i == 0:
#             yield i
#             n = n / i
#             limit = sqrt(n)   
#         else:
#             i += 1
#     if n > 1:
#         yield n
# def pfac(num):
#     d=defaultdict(int)
#     for f in factor(num):
#         d[f]+=1
#     terms=[]
#     for e in sorted(d.keys()):
#         if d[e]>1:
#             terms.append(d[e])
#         else:
#             terms.append(e)
#     return terms
def pfac(n):
    result = []
    for i in range(2,n+1):
        s = 0;
        while n/i == floor(n/float(i)): 
            n = n/float(i)
            s += 1
        if s > 0:
            for k in range(s):
                result.append(i) 
    return result
t = int( sys.stdin.readline().strip() )
while t>0:
    n = int( sys.stdin.readline().strip() )
    factors = pfac(n)   
    print (n-min(factors))
    t-=1