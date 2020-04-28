import sys
T=int(sys.stdin.readline())
while T>0:    
    N=int(sys.stdin.readline())
    reminder=N%2
    print(str(N/2) +" "+str(N/2+reminder))   
    T-=1