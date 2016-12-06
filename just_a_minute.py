n = int(input().strip())
min_t = 0
sec_t = 0
for i in range(1,n+1):   
    m,s  = map(int,input().strip().split(' ')) 
    min_t+=m ; sec_t+=s
avg = (sec_t/min_t)/60
if avg<=1.0: print('measurement error')
else: print('%.7f' %(avg))    
    
    


      
    

    