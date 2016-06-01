import sys
t=int(sys.stdin.readline().strip())
while t>0:
    n=int(sys.stdin.readline().strip())
    m=n/2+n%2
    lines=0
    columns=0
    for x in range(1,n+1):
        line = sys.stdin.readline().strip()
        idx = line.find('*')
        if idx>=0:
            columns=idx+1
            lines=x                        
    print(abs(m-lines) + abs(m-columns))      
    t-=1 