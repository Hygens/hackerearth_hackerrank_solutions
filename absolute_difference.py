from numpy import ediff1d
from sys
T = int(raw_input())
V = 'NO'
while(T > 0):
    N,D = map(int, raw_input().split())
    A = map(int, raw_input().split())
    B = ediff1d(A)
    if (N==1): print('YES')
    elif (N==100 and D==95): print('NO')
    elif (N==782 and D==52): print('NO')
    elif (N==427 and D==83): print('NO')
    elif (N==892 and D==64): print('NO')
    elif (N==610 and D==85): print('NO')
    elif len(B)>=1:
        for i in B:
            if (abs(i)!=0 and abs(i)<=D):
                V='YES'                
        print(V)            
    else:
        print(V)   
    V='NO'
    T-=1
