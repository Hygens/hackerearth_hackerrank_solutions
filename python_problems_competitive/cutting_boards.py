import sys
M = 10**9+7
t = int(sys.stdin.readline().strip())
for i in range(t):
    y,x = map(int, sys.stdin.readline().strip().split(' '))
    cy = sorted(map(long, sys.stdin.readline().strip().split(' ')), reversed=True)
    cx = sorted(map(long, sys.stdin.readline().strip().split(' ')), reversed=True)
    tempx = 1 ; tempy = 1 ; m = 0 ; n = 0 ; cst = 0L
    while n < x - 1 or m < y - 1:
        if n == x - 1:
            cst += cy[m] * tempx
            tempy+=1
            m+=1
        elif m == y - 1:
            cst += cx[n] * tempy
            tempx+=1
            n+=1
        elif cx[n] > cy[m]:
            cst += cx[n] * tempy
            tempx+=1
            n+=1        
        else:
            cst += cy[m] * tempx;
            tempy+=1
            m+=1    
    print(cst % M)
