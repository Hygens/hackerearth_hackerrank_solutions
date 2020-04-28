import sys
from operator import sub
a = map(int,sys.stdin.readline().strip().split(' '))
b = map(int,sys.stdin.readline().strip().split(' '))
s = map(sub,a,b)
A = filter(lambda x: x>0,s)
B = filter(lambda x: x<0,s)
print(str(len(A))+' '+str(len(B)))