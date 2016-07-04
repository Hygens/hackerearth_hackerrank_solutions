import sys
from decimal import *
a,b,c = map(long,sys.stdin.readline().strip().split(' '))
n = long(sys.stdin.readline().strip())
M = 1000000007
A = [0]*n ; A[0] = ((a%M)*c)%M
B = [0]*n ; B[0] = ((b%M)*c)%M
for i in range(1,n):
    A[i] = (A[i-1]*(((a*b%M)*c)%M)) + (A[i-1]*(a*b%M))%M + (A[i-1]*(a*c%M))%M;
    A[i] = A[i]%M;
    B[i] = (B[i-1]*(((b*c%M)*a)%M)) + (B[i-1]*(b*a%M))%M + (B[i-1]*(b*c%M))%M;
    B[i] = B[i]%M;
A = sorted(A) ; B = sorted(B) ; mA = A[0]+B[1] ; mB = B[0]+A[1]
if mA<mB: print(mA)  
else: print(mB) 