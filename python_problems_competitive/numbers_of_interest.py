T=int(raw_input())
for n in range (T):
    X,Y,N=map(int,raw_input().split(" ")) ;  L=[Y for i in range(X)]
    if N<=X: print (Y)
    else: 
        for i in range(X+1,N+1):
            if i==X+1:
                L.append(sum(L))
            else:
                L.append(sum(L[i-(X+1):i]))
        print(L[N-1])