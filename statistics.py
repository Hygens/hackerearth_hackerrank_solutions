s = input().strip(' ')
case = 1
while s!='':
    try:
        l = list(map(int,s.split(' ')))
        minl = min(l[1:])
        maxl = max(l[1:])
        print('%s%i%s %i %i %i' %('Case ',case,':',minl,maxl,maxl-minl))
        s = input().strip(' ')
        case+=1
    except (EOFError):
        break


        
                      
   

    

      
    

    