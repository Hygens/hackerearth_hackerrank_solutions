n = int(input().strip())
for i in range(n):
    s, d = map(float, input().strip().split(' '))
    a = (s+d)/2
    b = s - a
    if a.is_integer() and b.is_integer() and a >= 0 and b >= 0:
        a = int(a)
        b = int(b)
        print (max(a,b), min(a,b))
    else:
        print ('impossible')
    