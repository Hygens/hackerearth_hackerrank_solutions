from itertools import combinations
import operator
import sys
T=int(sys.stdin.readline())
while T>0:
    N=int(sys.stdin.readline().strip())
    L=map(int, sys.stdin.readline().strip().split(' '))
    soma=len(filter(lambda (x,y): operator.xor(x,y)%2!=0,combinations(L,2))) 
    print(soma)
    T-=1