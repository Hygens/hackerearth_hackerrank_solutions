import sys
from math import factorial as fact
n=int(sys.stdin.readline().strip())
a = set(map(int,sys.stdin.readline().strip().split(' ')))
m = len(a)
print(fact(m)/(fact(3)*fact(m-3)))