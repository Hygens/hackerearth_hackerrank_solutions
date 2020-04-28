import sys
T=int(sys.stdin.readline().strip())
while T>0:    
    N=int(sys.stdin.readline().strip())
    S = sum(filter(lambda x: x%2!=0,map(int,sys.stdin.readline().strip().split(' '))))
    print(S)  
    T-=1