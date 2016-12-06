from sys import stdin,stdout
T = int(stdin.readline().strip())
for t in range(T):
    N,p = map(int,stdin.readline().split(' '))
    action = ''
    stack = []
    stack.append(p)
    for n in range(N):
        action = stdin.readline().strip()
        if action == 'P':
            p = int(stdin.readline().strip())
            stack.append(p)
        else:
            stack.append(stack[len(stack) - 2])    
    stdout.write("Player " + str(stack.pop()) + '\n')
