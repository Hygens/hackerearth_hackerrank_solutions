from fractions import gcd
t = int(input().strip())
def lcm(a,b):
    return (a*b)//gcd(a,b)
def add(a, b, c, d):
    den = b*d
    num = d*a + b*c
    aux = gcd(den, num)
    if den<0:
        den*=-1
        num*=-1
    return num//aux, den//aux
def sub(a, b, c, d):
    den = b*d
    num = d*a - b*c
    aux = gcd(den, num)
    if num<0:
        den*=-1
        num*=-1
    return num//aux, den//aux
def mul(a, b, c, d):
    den = b*d
    num = a*c
    aux = gcd(abs(den), abs(num)) 
    return num//aux, den//aux
def div(a, b, c, d):
    den = b*c
    num = a*d
    aux = gcd(den, num)
    if den<0:
        den*=-1
        num*=-1
    return num//aux, den//aux
for i in range(t):
    a,b,op,c,d = input().strip().split(' ')
    a,b,c,d = map(int, [a,b,c,d])
    if b<0:
        a*=-1
        b*=-1
    if d<0:
        c*=-1
        d*=-1
    if op=='+':
        print ("%s / %s" % add(a,b,c,d))
    elif op=='-':
        print ("%s / %s" % sub(a,b,c,d))
    elif op=='*':
        print ("%s / %s" % mul(a,b,c,d))
    elif op=='/':
        print ("%s / %s" % div(a,b,c,d))