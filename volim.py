p = int(input().strip())
qs = int(input().strip())
time = 60*3+30
ttime = 0
for i in range(qs):
    a, b = input().strip().split(' ')
    a = int(a)
    ttime += a
    if ttime > time:
        break
    if b == 'T':
        p+=1
print(p%8 or 8)