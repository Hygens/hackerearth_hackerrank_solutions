def cool(n):
    ds = [0]*32
    count = 0
    while n > 0:
        ds[count] = n % 2
        count+=1
        n //= 2    
    res = 0
    for i in range(count - 1,-1,-1):
        if ds[i] == 1:
            if i - 1 >= 0 and i - 2 >= 0 and ds[i - 1] == 0 and ds[i - 2] == 1:
                res += 1  
    return res

cools = [0]*100001
for i in range(100001):
    cools[i] = cool(i)

T = int(input().strip())
for _ in range(T):
    r, k  = map(int,input().split(' '))   
    res = 0
    for i in range(1,r+1):
        if cools[i] >= k:
            res += 1
    print(res)