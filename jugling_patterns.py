s = input().strip()
while s:
    try:
        l = list(map(int,list(s)))
        balls = sum(l)/len(l)
        if balls==0: print('%s: valid with %i balls' %(s,int(balls)))
        else:
            if balls.is_integer():
                tmp = set()
                for k,v in enumerate(l):
                    tmp.add(k+1+v)
                if len(tmp)==len(l):
                    print('%s: valid with %i balls' %(s,int(balls)))
                else:
                    print('%s: invalid pattern' %(s))        
            else:
                print('%s: invalid # of balls' %(s))
        s = input().strip()
    except (EOFError):
        break
    
    


      
    

    