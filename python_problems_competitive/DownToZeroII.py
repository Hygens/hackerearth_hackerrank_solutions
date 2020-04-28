from math import sqrt
v = [0]*1001010
n = 0
def bfs(c,q):
    global v
    m = c[0]
    for i in range(2,int(round(sqrt(m)))):
        if m%i == 0:
            nt = max(i, m//i)
            if v[nt]:
                v[nt] = 1
                q.append([nt, c[1] + 1])    
    if m and not v[m - 1]:
        v[m - 1] = 1
        q.append([m - 1, c[1] + 1])
    return q
    
t = int(input().strip())
while t>0:
    n = int(input().strip())
    q = []
    ans = 0
    q.append([n, 0])
    while q:
        c = q[0]
        q.pop()
        if c[0] == 0:
            ans = c[1]
            break       
        bfs(c, q)    
    print("%i\n" %(ans))
    t-=1
    


