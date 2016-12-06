inp = int(input().strip())
d = {}
for _ in range(inp):    
    a,b = input().split(' ')
    if a.isdigit(): d[int(a)//2]=b
    else: d[int(b)]=a

for k,v in sorted(d.items()):
    print(v)    
        
    
    
    
   
    