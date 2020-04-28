from sys import stdin,stdout
t = int(stdin.readline().strip())
while t>0:
    n = int(stdin.readline().strip())
    x = [int(stdin.readline().strip()) for i in range(n)]
    y = [int(stdin.readline().strip()) for i in range(n)]
    xs = 0
    for i in range(len(x)):
        dist = abs(x[i] - y[i])
        xs ^= (dist - 1)    
    if xs != 0:
        stdout.write('player-2\n')
    else:
        stdout.write('player-1\n')
    t-=1