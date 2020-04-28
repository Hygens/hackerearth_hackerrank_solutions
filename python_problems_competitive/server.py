n,T = map(int,input().split(' '))
s = 0 ; count = 0
for v in map(int,input().split(' ')):     
    if s<=T: 
        s+=v ; count+=1
        if s>T: s-=v ; count-=1 ; break    
    else: break
print(count)

        
                      
   

    

      
    

    