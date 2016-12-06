n = int(input().strip())
s = 0 
for _ in range(n):
    x = input().strip() 
    s += int(x[0:-1])**int(x[-1]) 
print(s)
 
    
    
   
    