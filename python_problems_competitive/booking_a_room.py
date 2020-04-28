r,n = map(int,input().split(' '))
if r==n: print('too late')
else:
    l = set(range(1,r+1))
    o = set()
    for _ in range(n):
        o.add(int(input().strip()))
    print(list(l-o)[0])
        