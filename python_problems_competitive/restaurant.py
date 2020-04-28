from fractions import gcd
t = int(input().strip())
while t > 0:
    l, b = map(int,input().split(' '))
    r = 0
    if l < b: 
        r = l; l = b; b = r
    g = gcd(l, b);
    print((l // g) * (b // g))
    t-=1
