import sys
def ntimes(seq):
    seqLen = len(seq)
    l = []
    i = 0
    palLen = 0
    while i < seqLen:        
        if i > palLen and seq[i - palLen - 1] == seq[i]:
            palLen += 2
            i += 1
            continue      
        l.append(palLen)
        s = len(l) - 2
        e = s - palLen
        for j in xrange(s, e, -1):           
            d = j - e - 1
            if l[j] == d: 
                palLen = d                
                break
            l.append(min(d, l[j]))
        else:         
            palLen = 1
            i += 1  
    l.append(palLen)
    lLen = len(l)
    s = lLen - 2
    e = s - (2 * seqLen + 1 - lLen)
    for i in xrange(s, e, -1):       
        d = i - e - 1        
        l.append(min(d, l[i]))
    return l
q = int(sys.stdin.readline().strip())
while q>0:
    a = sys.stdin.readline().strip()
    b = sys.stdin.readline().strip()
    c = a+b
    d = len(set(c))    
    if d==1 and len(c)==2: print(c)
    elif d<len(c) and len(c)>2:
        palindrome = ntimes(list(c))
        if palindrome!=None and len(palindrome)>0: print(palindrome)
        else: print(-1)   
    else: print(-1)
    q-=1