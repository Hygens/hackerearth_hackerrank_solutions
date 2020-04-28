T = int(input().strip())
for _ in range(T):
    cA=0;cB=0
    A,B,N = map(int,input().strip().split(' '))
    C = sorted([int(x) for x in input().strip().split(' ')])
    for i in range(N):   
        if A-C[i]>=0:        
            A=A-C[i]
            cA+=1        
        if B-C[i]>=0:
            B=B-C[i]
            cB+=1   
    if cA==cB:
        print("Tie")
    elif cA>cB:
        print("Raghu Won")
    else:   
        print("Sayan Won")
