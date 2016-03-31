from decimal import *
T = int(raw_input())
while(T > 0):
    X,Y,Z= map(float,raw_input().split())
    C = (Z+Y-X)/2 ; B = Y-C ; A = Z-C
    S = 2*(A*B+B*C+A*C)
    print('%.2f'%(S))
    T-=1
    
