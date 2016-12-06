def fib(n,m):
    v1, v2, v3 = 1, 1, 0    
    for rec in bin(n)[3:]:  
        calc = v2*v2
        v1, v2, v3 = (v1*v1+calc)%m, ((v1+v3)*v2)%m, (calc+v3*v3)%m
        if rec=='1':    v1, v2, v3 = v1+v2, v1, v2
    return v2

s = input().strip()
while s:
    try:
        n,m = map(int,s.split(' '))
        if n==0 or m==0: print(0)
        else: print('%d' %(fib(n,2**m)))
        s = input().strip()
    except (EOFError):
        break
