from itertools import zip_longest

def grouper(iterable, n, fillvalue=None):    
    args = [iter(iterable)] * n
    return zip_longest(*args, fillvalue=fillvalue)

n = int(input().strip())
soma = 0
l = []
for _ in range(n):
    l.append(int(input().strip()))
l = sorted(l,reverse=True)
r = list(map(lambda x: sum(list(x))-min(list(x)),grouper(l,3,0)))
print(sum(r))

      
    

    