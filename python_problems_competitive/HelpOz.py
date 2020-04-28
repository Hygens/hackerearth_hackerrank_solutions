import sys
m = int(sys.stdin.readline().strip())
l = []
mod = [0]*m
res = ''
for _ in range(m):
    l.append(int(sys.stdin.readline().strip()))    
l = sorted(l)
rng = [x for x in range(2,l[0]+1) if x<=l[0]]
for k in rng: 
    for j in range(0,m):  
        mod[j] = l[j] % k 
    flag = False 
    for g in range(1,m):
        if mod[g-1] == mod[g]:
            flag = True                
        else:
            flag = False          
    if flag:
        res+=str(k) + ' '
print(mod)
print(res.strip())
        
