from math import factorial as fact
b = input().strip()
while b:
    try:          
        print('%d' %(sum(list(map(int,str(fact(int(b))))))))              
        b = input().strip()                   
    except (EOFError):
        break