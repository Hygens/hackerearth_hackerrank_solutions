from sys import stdin
t = int(stdin.readline().strip())
for i in range(1, t+1):
    a, b = map(int, stdin.readline().strip().split(' '))
    if b%2**a == -1%2**a:
        print('Case #%s: ON' %(i))
    else:
        print('Case #%s: OFF' %(i))