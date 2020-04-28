import sys
M=10**9+7
def substrs(s):
    for i in xrange(3,len(s)+1):
        for j in xrange(i):
            yield s[j:i]  
n = int(sys.stdin.readline().strip())
while n>0:
    s = sys.stdin.readline().strip()
    cnt = 0
    size_s = len(s)
    size_p = 0
    subs = list(substrs(s))
    for sub in [sb for sb in subs if len(sb)>=2 and len(sb)<size_s and s.count(sb)>1]:
        if size_p<size_s: 
            cnt =  s.count(sub)
            if cnt>1: size_p += cnt*len(sub) 
        else: break
    if (size_s-size_p==0): print((size_p//2)%M)
    else: print((size_s-size_p)%M)
    n-=1
        