import sys 
n = int(sys.stdin.readline().strip()) 
if n==2: print(1)
else: print((((n*n-n)//2)-1+n)%1000000007)
