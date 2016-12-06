blk = 0
b = input().strip() 
while True:
    try:             
        if b:  
            b, p, m = int(b), int(input().strip()), int(input().strip())                    
            print('%d' %(pow(b,p,m)))
            blk=0
        else: blk+=1
        if blk>1: break
        b = input().strip()                   
    except (EOFError):
        break