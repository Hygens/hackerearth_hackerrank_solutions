T = int(input().strip())
for _ in range(T):
    A,B = [int(x) for x in input().strip().split(' ')]
    cnt = 0
    for x in range(A,B+1):
        s = str(x)
        if s==s[::-1]: cnt+=1
    print(cnt)
    

