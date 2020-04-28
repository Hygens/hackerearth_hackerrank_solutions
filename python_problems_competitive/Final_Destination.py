import sys
D=list(sys.stdin.readline())
l = [0,0]
d = ''
for d in D:
    if d=='L': l[0]-=1
    elif d=='R': l[0]+=1
    elif d=='U': l[1]+=1
    elif d=='D': l[1]-=1    
print(' '.join(map(str,l)))
    