import math
from itertools import zip_longest

def grouper(iterable, n, fillvalue=None):    
    args = [iter(iterable)] * n
    return zip_longest(*args, fillvalue=fillvalue)

n = int(input().strip())
for _ in range(n):
    s = input().strip()
    size = math.ceil(math.sqrt(len(s)))
    l = [list(x) for x in grouper(list(s),size)]
    l = [[l[j][i] for j in range(len(l))] for i in range(len(l[0])-1,-1,-1)]
    res = ''
    for v in l:
        res+=''.join(v)
    print(res)
    
    
    