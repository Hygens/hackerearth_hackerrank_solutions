n = int(input().strip())
res = [0, 0, 0]
inp = list(map(int,input().split(' ')))
for i in range(n):
    res[i % 3] += inp[i]
for j in range(3):
    print("%d" %(res[j]), end=" " if j < 3 - 1 else "\n") 