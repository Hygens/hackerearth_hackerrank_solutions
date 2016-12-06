from math import log, floor
from sys import stdin,stdout
n,q = [int(x) for x in stdin.readline().split(' ')]
a = [0]*(n+1)
i = 1
for x in stdin.readline().split(' '):  
    num = int(x)  
    a[i] = int(floor(log(num) / log(2)) + 1 + a[i - 1]) % 2
    i+=1
for _ in range(q):
    l,r = [int(x) for x in stdin.readline().split(' ')]
    stdout.write('Mishki\n' if (a[r]-a[l-1])%2!=0 else 'Hacker\n')

    

