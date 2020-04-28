inp = input() 
while inp: 
    try:
        a,b = map(int,inp.split(' '))
        print(abs(a-b))    
        inp=input()
    except (EOFError):
        break 
    
    
   
    