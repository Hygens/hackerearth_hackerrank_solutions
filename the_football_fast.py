t = int(input().strip())
q,id = [x for x in input().split(' ')]
l = [id]
steps = []
for _ in range(t):
    j = None
    for _ in range(int(q)):
        Q = input().strip()
        if len(Q)>1: 
            l.append(Q.split(' ')[1])
            steps.append('P')
        else: 
            if len(l)>0 and steps[-1]!='B': 
                j = l.pop()
                steps.append('B')
            elif len(l)>0 and steps[-1]=='B': 
                l.append(j)
                j = l[-2]                
                steps.append('B')        
    print('Player %s' %(l[-1]))
        
        
        
        
        