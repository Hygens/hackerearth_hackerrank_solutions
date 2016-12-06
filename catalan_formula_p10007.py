from math import factorial as fact
b = int(input().strip()) 
while b!=0:
    try:          
        c = (fact(2*b)//(fact(b)*fact(b)*(b+1)))*(fact(b))                    
        print('%d' %(c))       
        b = int(input().strip())                   
    except (EOFError):
        break