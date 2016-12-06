from math import factorial as fact
b = input().strip()
while b:
    try: 
        b = int(b)         
        c = fact(2*b)//(fact(b)*fact(b)*(b+1))                    
        print('%d' %(c))       
        b = input().strip()                   
    except (EOFError):
        break