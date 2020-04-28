from sys import stdin
e, m = 365, 687
s = stdin.readline().strip()
case = 1
while s:
    try:        
        k, n = map(int, s.split(' '))
        if k == n == 0:
            print ("Case %s: %s" % (case, 0))            
        else:
            s = e - k
            n += s
            while n%m != 0:
                s+=e
                n+=e
            print ("Case %s: %s" % (case, s))
        s = stdin.readline().strip()
        case+=1
    except (EOFError):
        break
