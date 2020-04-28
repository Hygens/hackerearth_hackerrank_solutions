inp = input().strip()
s = 1
while inp!='0': 
    try:
        m =0
        n = int(inp)
        if n%2!=0: m=n//2+1
        else: m=n//2
        l = []
        for _ in range(n):
            l.append(input().strip())
        l1=l[0::2]+l[1::2][::-1]
        print('SET %i' %(s))
        print('\n'.join(l1))    
        inp=input()
        s+=1
    except (EOFError):
        break 