n = int(input().strip())
while n!=0:    
    l1 = list(map(int, [input().strip() for x in range(n)]))
    l2 = list(map(int, [input().strip() for x in range(n)]))
    d = {k:v for k,v in zip(sorted(l1), sorted(l2))}
    for i in l1:
        print(d[i])
    n = int(input().strip())
    if n==0: break
    print('')