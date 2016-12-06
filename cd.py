from collections import defaultdict
buff = defaultdict(lambda: 0)
inp = input().strip()
while inp!='0 0': 
    try:
        n,m = map(int,inp.split(' '))
        r = 0        
        for i in range(n+m):
            j = int(input().strip())
            if buff[j]: r+=1
            else: buff[j]=1
        print(r)        
        inp=input().strip()
        if  inp=='' or inp==None or inp=='0 0': break
    except (EOFError):
        break 
    
    
   
    