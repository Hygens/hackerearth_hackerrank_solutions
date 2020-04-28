t = int(input().strip())
s1 = 0 ; s2 = 0 ; s3 = 0
for _ in range(t):
    k, n = map(int,input().split(' '))
    s1 = n*(n+1)/2;
    odi = 1 ; odf=2*n-1
    s2 = (n/2)*(odi+odf)
    evi = 2 ; evf=2*n
    s3 = (n/2)*(evi+evf)   
    print('%.f %.f %.f %.f' %(k,s1,s2,s3))    
        
                      
   

    

      
    

    