import sys
from math import log
from Crypto.Util.number import isPrime
rems = map(long,sys.stdin.readline().strip().split(' '))
n = int(sys.stdin.readline().strip())
while n>0:
    a,b = map(long,sys.stdin.readline().strip().split(' '))
    s = 0
    if a>1:
        for x in range(a,b+1):
            logg = round(x/log(x))
            size = len(str(x))
            if isPrime(logg) and logg%size==rems[size-1]: s+=1
        print('%.f' %(s//2))   
    elif a==1:
        for x in range(2,b+1):
            logg = round(x/log(x))
            size = len(str(x))
            if isPrime(logg) and logg%size==rems[size-1]: s+=1
        print('%.f' %(s//2))    
    n-=1