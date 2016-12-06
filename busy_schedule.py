n = int(input().strip())
while n!=0:   
    l = []
    for i in range(n):
        h, x = input().strip().split(' ')
        h, m = map(int, h.split(':'))
        if x[0] == 'p' and h!=12: h+=12
        elif h==12 and x[0]=='a': h= 0
        l.append((h,m))
    l = sorted(l)
    for h, m in l:
        s = ''
        x = 'a.m.'
        if h==0: h = 12
        elif h >= 12:
            x = 'p.m.'
            if h != 12:
                h-=12
        print("%s:%.2d %s" %(h, m, x))
    print('')
    n = int(input().strip())