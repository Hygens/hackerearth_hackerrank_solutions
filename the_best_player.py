from sys import stdin,stdout
from collections import defaultdict
n,t = map(int,stdin.readline().strip().split(' '))
d = defaultdict()
for _ in range(n):
    name,quoc = [int(x) if x.isnumeric() else x for x in stdin.readline().strip().split(' ')]
    d[name]=quoc
l = sorted(d.items(),key=lambda x: x[1],reverse=True)  
print(l)  
cnt = 0 
for it in l:    
    if cnt<t:
        f = list(filter(lambda x: x[1]==it[1],l))
        if len(f)>1:
            f = sorted(f,key=lambda x: x[0])
            print(f)
            stdout.write(f[0][0]+'\n')
            cnt+=1
        else:        
            stdout.write(it[0]+'\n')
            cnt+=1
    else:
        break

