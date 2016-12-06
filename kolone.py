from operator import add, itemgetter
from functools import reduce
n,m = map(int, input().strip().split(' '))
starting = input().strip()[::-1]
ending = input().strip()
t = int(input().strip())
a = [(i+t,2,l) for i,l in enumerate(starting)]
a += [(n+i,1,l) for i,l in enumerate(ending)]
a=sorted(a)
print (reduce(add, map(itemgetter(2),a), ''))