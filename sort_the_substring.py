from sys import stdin,stdout
t = int(stdin.readline().strip())
for _ in range(t):
    s,n,m = [int(x) if x.isnumeric() else x for x in stdin.readline().strip().split(' ')]    
    s = s[:n]+''.join(sorted(s[n:m+1],reverse=True))+s[m+1:]+'\n'   
    stdout.write(s)

