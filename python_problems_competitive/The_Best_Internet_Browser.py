import sys
t=int(sys.stdin.readline().strip())
while t>0:
    s=sys.stdin.readline().strip()
    r=s[s.index('.')+1:s.rindex('.')]
    r=r.translate(None,'aeiou')+'.com'
    print(str(len(r))+'/'+str(len(s)))
    t-=1

    