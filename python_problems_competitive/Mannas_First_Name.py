import sys
t = int(sys.stdin.readline().strip())
SUVO = 'SUVO'
SUVOJIT = 'SUVOJIT'
while t>0:
    s = sys.stdin.readline().strip()
    suvo = 0
    suvojit = 0
    idx_suvo = s.find(SUVO)
    idx_suvojit = s.find(SUVOJIT)
    while True:  
        if idx_suvojit>=0: 
            suvojit+=1
            s = s[0:idx_suvojit]+s[idx_suvojit+len(SUVOJIT):]
            idx_suvojit = s.find(SUVOJIT)  
            idx_suvo = s.find(SUVO)  
        if idx_suvo!=idx_suvojit and idx_suvo>=0: 
            suvo+=1
            s = s[0:idx_suvo]+s[idx_suvo+len(SUVO):]
            idx_suvo = s.find(SUVO)
            idx_suvojit = s.find(SUVOJIT)         
        if (idx_suvo<0 and idx_suvojit<0): break        
    print('SUVO = '+str(suvo)+', '+'SUVOJIT = '+str(suvojit))
    t-=1