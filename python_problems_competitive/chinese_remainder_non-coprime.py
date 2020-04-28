from fractions import gcd
def lcm(a,b):
    return (a*b)/gcd(a,b)
MMI = lambda A, n,s=1,t=0,N=0: (n < 2 and t%N or MMI(n, A%n, t, s-A//n*t, N or n),-1)[n<1]
n = int(input().strip())
for i in range(n):
    a,n,b,m = map(int, input().strip().split(' '))
    K = n*m ; M1=K//n ; M2=K//m ; M1_inv = MMI(M1,n) ; M2_inv = MMI(M2,m)
    x = (a*M1*M1_inv+b*M2*M2_inv) % K
    print('%i %i' %(x,K))