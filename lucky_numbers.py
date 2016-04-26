T=int(raw_input())
while T>0:    
    N=long(raw_input())
    s=0
    while (N>0):
        if "{0:b}".format(N).count("1")==2: 
            s=s+N
        N-=1
    print(s)    
    T-=1