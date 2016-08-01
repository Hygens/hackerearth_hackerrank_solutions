import sys
from decimal import Decimal
a,b,c = map(long,sys.stdin.readline().strip().split(' '))
n = int(sys.stdin.readline().strip())
A = [0]*n ; A[0] = a*c
B = [0]*n ; B[0] = b*c
for i in range(1,n):
    A[i] = A[i-1]*a*b*c + A[i-1]*a*b + A[i-1]*a*c
    A[i] = A[i]%1000000007
    B[i] = B[i-1]*b*c*a + B[i-1]*b*a + B[i-1]*b*c
    B[i] = B[i]%1000000007
A = sorted(A) ; B = sorted(B)
mA = A[0]+B[1] ; mB = B[0]+A[1]
if mA<mB: print(mA)  
else: print(mB) 
