n = int(input().strip())
v = list(map(int,input().split(' ')))
mine = 0
for i in range(n-1,-1,-1):
    mine = (mine + v[i] +1)//2
print(mine)
