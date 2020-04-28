def count(m):
    s = 0
    for k in range(1,m+1):
        if k==1 or k==m: 
            s+=m
        elif k==2: 
            s+=(m-1)*2
        elif k>2 and k<m: 
            s+=(m-(k-1))*k
    return s
t = int(input().strip())
while t>0:
    n = int(input().strip())
    l = set(map(int,input().split(' ')))
    m = len(l)
    print(count(m))
    t-=1