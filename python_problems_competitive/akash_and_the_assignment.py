from sys import stdin,stdout
n,q = [int(x) for x in stdin.readline().strip().split(' ')]
s = list(stdin.readline().strip())
for _ in range(q):
    l,r,k = [int(x) for x in stdin.readline().strip().split(' ')]
    if r-l+1<k: stdout.write('Out of range\n')
    else: 
        srt = sorted(s[l-1:r])
        stdout.write(srt[k-1]+'\n')   
        
        
        
        
        
        