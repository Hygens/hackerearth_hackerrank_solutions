def calc_digits(mod):
    counter = 1
    result = 10          
    while result != 1:    
        result = (result * 10) % mod
        counter+=1
    if mod==3: counter+=1
    return counter

inp = input().strip()
while inp:
    try:
        n = int(inp) 
        
        print(calc_digits(n))

        inp = input().strip()
    except (EOFError):
        break