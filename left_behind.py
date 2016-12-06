s = input().strip()
while s!='0 0':
    try:         
        sweet,sour = map(int,s.split(' '))   
        if sweet+sour==13: print('Never speak again.')
        elif sweet>sour: print('To the convention.')  
        elif sweet<sour: print('Left beehind.')  
        elif sweet==sour: print('Undecided.')        
        s = input().strip()
    except (EOFError):
        break

        
                      
   

    

      
    

    