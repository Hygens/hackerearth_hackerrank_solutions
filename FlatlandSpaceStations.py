import sys
n,m = map(int,sys.stdin.readline().strip().split(' '))
c = map(int,sys.stdin.readline().split(' '))
l = [0]*n
if n>m:
    for i in c:
        l[i]=1
    dist = []
    for j in range(0,n):
        try:
            if l[j]==1:
                idx = l.index(0,j) 
                dist.append((idx-j+1)//2)
            else: 
                idx = l.index(1,j)
                dist.append((idx-j+1)//2)
        except ValueError:
            break
    print(max(dist))
else:
    print(0)    

    



