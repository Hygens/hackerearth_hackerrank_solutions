import math
import mpmath as mp
M = 1000000007
def fibSum(n):    
    if n == 0 or n == 1:
        return 0
    elif n == 2:
        return 1
    else:
        n = n+1
        a = math.sqrt(5) ; b =1+a ; c = 1-a
        e = (mp.power(b,n)-mp.power(c,n))/(mp.power(2,n)*a)
        return e-1

n = int(raw_input().strip())
while n>0:
    l,r = map(long,raw_input().strip().split(' '))
    s1 = fibSum(l-1)
    s2 = fibSum(r)
    s = mp.fmod((s2-s1),10000)
    print('%.f' %(mp.fmod(s,M)))
    n-=1