import sys
MMI = lambda A, n,s=1,t=0,N=0: (n < 2 and t%N or MMI(n, A%n, t, s-A//n*t, N or n),-1)[n<1]
def modExp(x,n):
    if n == 0:  return 1
    elif n%2==0: return modExp((x*x) % 1000000007,  n/2)
    else: return (x * modExp((x*x) % 1000000007, (n-1)/2)) % 1000000007  
t=int(sys.stdin.readline().strip())
m = 1000000007
while t>0:
    n=int(sys.stdin.readline().strip())
    print(MMI(modExp(2, n-1),m))
    t-=1

    