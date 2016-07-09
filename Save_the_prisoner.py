import sys
t=int(sys.stdin.readline().strip())
v = []
while t>0:
    n,m,s=map(int,sys.stdin.readline().strip().split(' '))
    s=s-1
    ident=m+s
    if ident>n:
        temp=ident-n;
        while temp>n:        
            temp=temp-n        
        v.append(temp)    
    else:
        v.append(ident)
    print(v[-1])
    t-=1


    