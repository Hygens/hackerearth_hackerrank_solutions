l = []
r = 0
s = input().strip()
while s:
    try:
        l.append(len(s))
        s = input().strip()
        if s=='' or s==None: break
    except (EOFError):
        break
max_s = max(l)
for x in l[0:-1]:
    if x!=max_s:
        r+=(max_s-x)**2
print(r)
        
                      
   

    

      
    

    