import sys
m = int(sys.stdin.readline().strip())
l = []
mod = [0]*m
res = ''
flag = False
for _ in range(m):
    l.append(int(sys.stdin.readline().strip()))    
l = sorted(l)
rng = [x for x in range(2,l[0]+1) if x<=l[0]]
for k in rng: 
    for j in range(0,m):  
        mod[j] = l[j] % k            
    for g in range(0,m-1):
        if mod[g] == mod[g + 1]:
            flag = True
        else:
            flag = False
            break             
    if flag:
        res+=str(k) + ' '
print(res.strip())
        
