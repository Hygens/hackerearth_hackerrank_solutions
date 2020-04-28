m,n = map(int,input().strip().split(' '))
d = dict()
for _ in range(m): 
    k,v = input().split(' ')
    d[k]=int(v)
for _ in range(n):
    try:
        sm = 0
        s = input().strip()    
        while s!='.':       
            for x in s.split(' '):
                if d.__contains__(x): sm+=d[x]
            s = input().strip()
        print(sm)        
    except (EOFError):
        break   
    