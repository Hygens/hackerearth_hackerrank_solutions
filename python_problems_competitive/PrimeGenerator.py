import sys
from primefac import primes
t = int(sys.stdin.readline().strip())
while t>0:
    start,end = map(long,sys.stdin.readline().strip().split(' '))
    prime_list = filter(lambda x: x>=start,primes(end+1))
    for y in prime_list:
        print(y)
    print
    t-=1
