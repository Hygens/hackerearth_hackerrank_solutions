import sys
def fib(n):
    v1, v2, v3 = 1, 1, 0    
    if n>0:
        for rec in bin(n)[3:]:  
            calc = v2*v2
            v1, v2, v3 = v1*v1+calc, (v1+v3)*v2, calc+v3*v3
            if rec=='1':    v1, v2, v3 = v1+v2, v1, v2
        return v2%10000
    else: 
        return 0
n = int(sys.stdin.readline().strip())
while n>0:
    l,r = map(long,sys.stdin.readline().strip().split(' '))
    s = 0
    i = l-1
    while i<r:
        s+=fib(i)
        i+=1        
    print(((fib((r+2)-1))%1000000007)
    n-=1