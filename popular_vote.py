from collections import Counter
inp = int(input().strip()) 
for _ in range(inp): 
    n = int(input().strip()) 
    l = []
    for _ in range(n):        
        l.append(int(input().strip()))  
    d = Counter(l)  
    if l.count(l[0]) == n: print('no winner')
    else:
        maxn = max(l)
        candidate = l.index(maxn)+1
        avg = (maxn/sum(l))*100   
        if avg>50.0: print('majority winner %i' %(candidate))
        else: print('minority winner %i' %(candidate))
    
    
   
    