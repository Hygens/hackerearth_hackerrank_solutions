from fractions import gcd
import sys
def function(L,R):
    s=0
    for i in range(L,R+1):              
        for j in range(1,i+1):          
            cnt=0
            if (j)*(j+1) == 2*i :
                for k in range(1,i+1):  
                    if gcd(k,i)==1:    
                        cnt+=1
            s+=cnt
    return s
t=int(sys.stdin.readline())
while t>0:
    l,r = map(long,sys.stdin.readline().strip().split(' '))
    print(function(l,r))
    t-=1