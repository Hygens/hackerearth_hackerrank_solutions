N = int(input().strip())
A = [int(x) for x in input().strip().split(' ')]
S,E = [int(x) for x in input().strip().split(' ')]
t = S
res = False
count = 0
while t != E:
    t = A[t-1]
    count += 1
    if count >= N:
        break
if t == E:
    res = True
print("Yes" if res else "No")