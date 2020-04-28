from sys import stdin,stdout
x,k = stdin.readline().split(' ')
l = list(x)
k = int(k)
i = 0  
while k>0: 
    if l[i]!='9': 
        l[i]='9'
        k-=1
        i+=1        
    else:
        i+=1
stdout.write(''.join(l)+'\n')
    

