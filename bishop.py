s = input().strip()
while s:
    try:         
        n = int(s)
        if n<=2: print(n)     
        else: print(n+(n-2))
        s = input().strip()
    except (EOFError):
        break

        
                      
   

    

      
    

    