result = {
            '+': lambda b,x: b+x,
            '-': lambda b,x: b-x,
            '*': lambda b,x: b*x,
            '/': lambda b,x: b//x,
            'N': lambda b,x: -b
        }
t = int(input().strip())
for _ in range(t):
    B = int(input().strip())
    l = []
    r = 1
    for _ in range(B):
        op = input().strip().replace(' ','')        
        if len(op)>1: 
            r = result[op[0]](r,int(op[1]))
        else: 
            op+='0'
            r = result[op[0]](r,int(op[1]))
        l.append(r)            
    print(max(l))