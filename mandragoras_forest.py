t = int(input().strip())
for x in range(0,t):
    n = int(input().strip())
    dt = list(sorted(map(int, input().split(' '))))
    suma = sum(dt)    
    s = 1 ; p = suma ; v = 0
    for i in range(0,n):
        s += 1      
        suma -= dt[i]
        v = suma*s
        if v > p: p = v    
    print(p)
