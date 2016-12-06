def fib(n):
    v1, v2, v3 = 1, 1, 0    
    for rec in bin(n)[3:]:  
        calc = v2*v2
        v1, v2, v3 = v1*v1+calc, (v1+v3)*v2, calc+v3*v3
        if rec=='1':  v1, v2, v3 = v1+v2, v1, v2
    return v2

s = input().strip()
while s:
    try:
        n = int(s)
        if n==0: print(n)
        else: print(fib(n))
        s = input().strip()
    except (EOFError):
        break
