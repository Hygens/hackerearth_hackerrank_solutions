def is_float(value):
    try:
        float(value)
        return True
    except ValueError:
        return False

s = input().strip()
while s:
    try:         
        name = []
        heart = [] 
        avg = 0.0       
        for x in list(s.split(' ')):
            if is_float(x): 
                heart.append(float(x))
            else: 
                name.append(x) 
        avg = sum(heart)/len(heart)       
        print('%.2f %s' %(avg,' '.join(name).strip()))
        s = input().strip()
    except (EOFError):
        break

        
                      
   

    

      
    

    