def countFibs(low, high):
    f1, f2, f3 = 1, 2, 3 
    result = 0 
    while f1 <= high:    
        if f1 >= low:
            result+=1
        f1=f2; f2=f3; f3=f1+f2
    return result
 
s = input().strip()
while s!='0 0':
    try:
        a,b = map(int,s.split(' '))        
        print('%d' %(countFibs(a,b)))        
        s = input().strip()
    except (EOFError):
        break