dp = {}
def op(p):
    return 'O' if p == 'S' else 'S'
def gm(a, b, p):
    if dp.__contains__((a,b)):
        if dp[(a,b)]:
            return p
        else:
            return op(p)
    if b == 0:
        dp[(a,b)] = False
        return op(p)
    a, b = max(a,b), min(a,b)
    w1 = gm(b, a%b, op(p))
    w2 = w1
    if a > 2*b:
        w2 = gm(a%b+b ,b, op(p))
    if p == w1 or p == w2:
        dp[(a,b)] = True
        return p
    dp[(a,b)] = False
    return w1
a, b = map(int, input().strip().split(' '))
while a+b!=0:    
    if 'S' == gm(a, b, 'S'):
        print ('Stan wins')
    else:
        print ('Ollie wins')
    a, b = map(int, input().strip().split(' '))