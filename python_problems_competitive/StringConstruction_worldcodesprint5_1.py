import sys
M=10**9+7
n = int(sys.stdin.readline().strip())
while n>0:
    s = sys.stdin.readline().strip()
    size_s=len(s)
    size_p=0
    cnt=0
    p=''
    for k,v in enumerate(s):
        if size_p>=2 and size_p<size_s:
            sub = s.find(p,k)
            if sub==size_p: 
                p+=s[sub:sub+size_p+1] 
                size_p=len(p)
            else:
                p+=v
                cnt+=1
                size_p+=1            
            if size_p==size_s: 
                break 
        elif size_p<size_s:
            p+=v
            cnt+=1
            size_p+=1        
    print(cnt%M)
    n-=1
        