import sys
from math import log
rems = map(long,sys.stdin.readline().strip().split(' '))
n = int(sys.stdin.readline().strip())
while n>0:
    a,b = map(long,sys.stdin.readline().strip().split(' '))
    if a>1:
        print('%.f' %(b/log(b) - a/log(a)))   
    elif a==1:
        print('%.f' %(b/log(b)))    
    n-=1
    
