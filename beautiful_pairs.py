import sys
n = int(sys.stdin.readline().strip())
a = map(int,sys.stdin.readline().strip().split(' '))
b = map(int,sys.stdin.readline().strip().split(' '))
s = 0
for x in a:    
    for k,y in enumerate(b):
        if (y==x):
            s+=1
            del b[k]
            break
if s<n: s+=1
elif s==n: s-=1
print(s)
