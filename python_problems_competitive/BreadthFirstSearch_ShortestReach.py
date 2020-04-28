nmax = 1005
t = int(input().strip())
for _ in range(t):
    n,m = map(int,input().split(' '))
    edges = [[]]*nmax    
    for _ in range(m):
        n1,n2 = map(int,input().split(' ')); n1-=1 ; n2-=1
        edges[n1].append(n2); edges[n2].append(n1)            
    start = int(input().strip())-1
    q = [] ; q.append(start)
    d = [0]*(nmax); d[start]=0
    while q:
        front = q.pop()            
        for i in range(0,len(edges[front])):
            v = edges[front][i]
            if d[v] == 0:
                d[v] = d[front] + 1
                q.append(v)
    for i in range(0,n):
        if i == start: continue
        print("%i " %(d[i] if d[i] == -1 else (d[i]*6)), end='')
    print('')
    
   
