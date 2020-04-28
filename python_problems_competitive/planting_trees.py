n = int(input().strip())
t = sorted(map(int, input().strip().split()), reverse=True)
print(max([i+v for i,v in enumerate(t, 1)]) + 1)