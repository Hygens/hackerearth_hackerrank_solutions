def egcd(a, b):
    if a == 0:
        return (b, 0, 1)
    else:
        g, y, x = egcd(b % a, a)
        return (g, x - (b // a) * y, y)
n, t = map(int, input().strip().split(' '))
while n+t!=0:   
    for i in range(t):
        s = input().strip().split(' ')
        a, op, b = int(s[0]), s[1], int(s[2])
        if op == '+':
            print ((a+b)%n)
        if op == '-':
            print ((a-b)%n)
        if op == '*':
            print ((a*b)%n)
        if op == '/':
            if b == 0:
                print (-1)
                continue
            g, x, y = egcd(b, n)
            if g!=1:
                print (-1)
            else:
                print ((x*(a//g))%n)
    n, t = map(int, input().strip().split(' '))