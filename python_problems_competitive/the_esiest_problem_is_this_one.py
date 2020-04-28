n = input().strip()
while n!='0':
    try:
        m = int(n)
        k=11
        while True:
            s1 = sum(map(int,list(str(m))))
            s2 = sum(map(int,list(str(k*m))))
            if s1==s2: 
                print(k) 
                k=11
                break
            else: k+=1
        n = input().strip()
    except (EOFError):
        break
            
    