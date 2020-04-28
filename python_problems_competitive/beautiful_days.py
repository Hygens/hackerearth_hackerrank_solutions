a,b,k = map(int, input().split(' ')) ; print([abs(int(x)-int(str(x)[::-1])) % k for x in range(a,b+1)].count(0))
