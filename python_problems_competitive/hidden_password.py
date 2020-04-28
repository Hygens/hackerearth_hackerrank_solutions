def is_sorted(l):
    return all(l[i] <= l[i+1] for i in range(len(l)-1))

pwd,s  = list(input().split(' '))
idx = 0
l = []
for c in pwd:        
    idx = s.find(c)
    if idx>=0: l.append(idx)
    else: break
    
if idx==-1: print('FAIL')
elif is_sorted(l): print('PASS')
else: print('FAIL')

      
    

    