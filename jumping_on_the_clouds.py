n = int(raw_input().strip()) 
c =map(int,raw_input().strip().split()) 
jumps=0
k=0
t=0 
inc=0
tam=0
while k<n-1:
    if 1 in c:
        t=c.index(1)
        if t==1: 
            inc=1 
            tam=2
        elif (t-1>=2 and (t-1)%2==0): 
            inc=(t-1)/2 
            tam=2*inc
        elif (t-1>=2 and (t-1)%2!=0): 
            inc=(t-1)/2+(t-1)%2  
            tam=2*inc-1     
        else: 
            inc=1 
            tam=inc
    elif (n-k)==1: 
        inc=1 
        tam=inc
    elif (n-k)==2:
        inc=1
        tam=2
    elif (n-k)>2 and (n-k)%2==0: 
        inc=(n-k)/2 
        tam=2*inc    
    elif (n-k)>2 and (n-k)%2!=0: 
        inc=(n-k)/2 
        tam=2*inc    
    jumps+=inc
    k+=tam
    c=c[tam:]    
print(jumps)