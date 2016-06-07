import sys
def modInv(x,m):
    return pow(x,m-2,m)
def modExp(x,n):
    if n == 0:  return 1
    elif n%2==0: return modExp((x*x) % 1000000007,  n/2)
    else: return (x * modExp((x*x) % 1000000007, (n-1)/2)) % 1000000007  
t=int(sys.stdin.readline().strip())
m = 1000000007
while t>0:
    n=int(sys.stdin.readline().strip())
    print(modInv(modExp(2, n-1),m))
    t-=1

    