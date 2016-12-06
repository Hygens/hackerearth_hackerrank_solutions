n = int(input().strip())
s1 = input().strip()
s2 = input().strip()
x = int('1'*len(s1),2)
y = int(s1,2)
for _ in range(n):
    y ^= x
if y==int(s2,2): print('Deletion succeeded')
else: print('Deletion failed')
    
    
    
   
    