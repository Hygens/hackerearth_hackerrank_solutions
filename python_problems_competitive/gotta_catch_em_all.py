from sys import stdin,stdout
k = int(stdin.readline().strip())
pkm = sorted([int(x) for x in stdin.readline().split(' ')], reverse=True) 
cnt = k  
maxi = pkm[0]+ 1
for i in range(cnt):
    maxi-=1
    if (pkm[i]+1)>maxi:    
        maxi+=(pkm[i]+1-maxi)    
suma=maxi+cnt
stdout.write(str(suma)+'\n')
   
    