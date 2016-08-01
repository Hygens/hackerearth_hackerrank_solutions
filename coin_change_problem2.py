import sys
def count(S, m, n):    
    table = [[0 for x in range(m)] for x in range(n+1)]
    for i in range(m):
        table[0][i] = 1 
    for i in range(1, n+1):
        for j in range(m):            
            x = table[i - S[j]][j] if i-S[j] >= 0 else 0            
            y = table[i][j-1] if j >= 1 else 0          
            table[i][j] = x + y 
    return table[n][m-1]
 
t=int(sys.stdin.readline().strip())
s = 0
while t>0:
    N,M = map(int,sys.stdin.readline().strip().split(' '))
    A = map(int,sys.stdin.readline().strip().split(' '))
    print(count(M,A))
    t-=1