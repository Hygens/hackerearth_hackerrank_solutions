from math import floor
from sys import stdin,stdout
n, p, q = map(int, stdin.readline().strip().split(' '))
l = (p+q) / float(n)
l = int(floor(l)) + 1
if l % 2 == 0:
    stdout.write('opponent\n')
else:
    stdout.write('paul\n')