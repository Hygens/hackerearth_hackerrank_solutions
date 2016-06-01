import sys
T=int(sys.stdin.readline())
while T>0:    
    N=int(sys.stdin.readline())
    s=[x for x in xrange(N) if "{0:b}".format(x).count("1")==2] 
    print(sum(s))    
    T-=1