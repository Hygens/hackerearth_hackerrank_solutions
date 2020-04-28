from sys import stdin,stdout
T = int(stdin.readline().strip())
for _ in range(T):
    N = int(stdin.readline().strip())
    stdout.write('No\n' if (N&(N-1))>0 else "Yes\n");

   
    