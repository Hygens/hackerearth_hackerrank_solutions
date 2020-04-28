import sys
t=int(sys.stdin.readline().strip())
while t>0:
    a,b = sys.stdin.readline().strip().split(' ')
    a = a[::-1] ; b = b[::-1] 
    c = int(a) + int(b) ; c = int(str(c)[::-1])
    print(c)
    t-=1