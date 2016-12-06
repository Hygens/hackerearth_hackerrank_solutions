from functools import reduce
M = 1000000007
n = int(input().strip())
a = [int(x) for x in input().strip().split(' ')]
m = int(input().strip())
for _ in range(m):
    t,l,r = map(int,input().strip().split(' ')) 
    if t==0:
        for i in range(0,r-l+1):
            a[l-1+i]+=2**(i+1)         
    else:        
        print(reduce(lambda x,y: (x%M+y%M)%M,a[l-1:r]))
  
