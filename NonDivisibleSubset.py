import sys
n, k = map(int,sys.stdin.readline().strip().split(" "))
arr = map(int,sys.stdin.readline().strip().split(" "))
d = {x:[] for x in range(k)}
for i in range(n): 
    d[arr[i]%k].append(arr[i])
    s = 0
    if len(d[0]) > 0:
        s = 1
    S = set([(x,k-x) for x in range(1,k//2+1)])
    for i,j in S:
        if i != j:
            if len(d[i]) > len(d[j]):
                s += len(d[i])
            else:
                s += len(d[j])
        else:
            if len(d[i]) > 0:
                s += 1
print s
        
         
