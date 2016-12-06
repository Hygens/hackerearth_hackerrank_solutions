from sys import stdin,stdout
from functools import reduce
from operator import mul

M = 1000000007

def idx_zeros(l, i):
    zeros = []
    while True:
        try:
            i = l.index(0, i)
            zeros.append(i)   
            if i>=0: i+=1              
        except ValueError:
            pass
            break                
    return zeros

n = int(stdin.readline().strip())
a = list(map(int,stdin.readline().strip().split(' ')))
q = int(stdin.readline())
b = [0] * n
zeros = idx_zeros(a,0)
while q > 0:
    Q = stdin.readline().strip().split(' ')
    i = int(Q[1])-1
    if Q[0] == '0':
        v = int(Q[2])
        a[i] = v
        if i in zeros and v>0: zeros.remove(i)
    elif Q[0] == '1':            
        b[i] = 1
        if zeros and not i in zeros:
            b[i] = 0
        else:
            b[i] = b[i]*reduce(mul,a[0:i],1)*reduce(mul,a[i+1:],1)
        stdout.write(str(b[int(Q[1])-1]%M) + '\n')
    q -= 1

