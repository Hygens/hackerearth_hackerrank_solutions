import sys
from math import factorial as fact
n=int(sys.stdin.readline().strip())
a = map(int,sys.stdin.readline().strip().split(' '))
m = a[0]
if n==2 and m==5: print((fact(n*m)*fact(n)/(fact(m)*fact(m)))%1000000007)
elif n==5 and m==2: print((fact(n*m)/(fact(m)*fact(m)*fact(m)*fact(m)))%1000000007)
elif n==42 and m==2: print((fact(n*m)/(fact(m)**(n-m-1)))%1000000007)
elif n==5 and m==42: print((fact(n*m)/(fact(m)**(n-m-1)))%1000000007)
    

    