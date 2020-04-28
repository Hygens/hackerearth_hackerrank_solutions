def numberOfTrailingZeros(n):
    c = 0
    i=5
    while n//i>=1:    
        c+=n//i;i*=5
    return c
t = int(input().strip())
for _ in range(t):
    a,b = map(int,input().strip().split(' '))
    s = 0
    for i in range(a,b+1):
        s+=numberOfTrailingZeros(i)
    print(s)