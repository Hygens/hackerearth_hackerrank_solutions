def bubble_sort ( array ) :
    count = 0    
    for i in range ( 0, len ( array ) - 1 ):
        for j in range ( 0, len ( array ) - i - 1 ):
            if array[j] > array[j + 1] :
                array[j], array[j + 1] = array[j + 1], array[j]                
                count+=1
    return count

t  = int(input().strip())
for c in range(t):        
    l = list(map(int,input().split(' '))) 
    print('%i %i' %(l[0],bubble_sort(l[1:])))
    


      
    

    