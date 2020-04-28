from bisect import bisect_left,bisect_right
alpha = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
T = int(input().strip())
for _ in range(T):
    s  = list(input().strip())  
    l = []
    for c in s:
        if l:
            pos = bisect_right(s[l[-1]:],c)
            if pos == -1: 
                pos= -bisect_left(s[:l[-1]],c)
            l.append(pos-l[-1])
        else:
            l.append(bisect_right(s,c)-1)
    print(' '.join(map(str,l))) 
        
    