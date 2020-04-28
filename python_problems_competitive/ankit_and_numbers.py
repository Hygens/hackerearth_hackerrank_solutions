T = int(raw_input()) 
while(T>0):
    N = int(raw_input())
    if N==1: print (1)
    else:
        s = [i for i in range(1,N+1)]
        soma = 0  
        ant = 0
        for idx, val in enumerate(s):
            soma+=2**(N-1)*val
        print soma        
    T-=1 