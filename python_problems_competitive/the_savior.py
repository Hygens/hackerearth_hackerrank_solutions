from sys import stdin,stdout
T = int(stdin.readline().strip())
for _ in range(T):
    n = int(stdin.readline().strip())
    a = [] ; b = []
    for x in stdin.readline().split(' '):
        i = int(x)
        if i%2==0: a.append(i)
        else: b.append(i)
    a = sorted(a) ; b = sorted(b) ; a1 = len(a); b1 = len(b)
    pre, now = -1, 0
    r1 = a1 * (a1 - 1) // 2
    r2 = b1 * (b1 - 1) // 2
    n1, n2 = 0, 0
    for i in range(a1):
        now = a[i]
        if now == pre:
            n1 += 1
        else:
            r1 -= (n1 * (n1 - 1) // 2)
            n1 = 1        
        pre = now    
    r1 -= (n1 * (n1 - 1) // 2)
    pre = -1
    for i in range(b1):
        now = b[i]
        if now == pre:
            n2 += 1
        else:
            r2 -= (n2 * (n2 - 1) // 2);
            n2 = 1        
        pre = now    
    r2 -= (n2 * (n2 - 1) // 2);    
    stdout.write(str(r1 + r2)+'\n')

    

