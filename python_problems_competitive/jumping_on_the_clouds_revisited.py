import sys
n,k = map(int,sys.stdin.readline().strip().split(' '))
d = {}
for key,v in enumerate(sys.stdin.readline().strip().split(' ')):
    if key<n-1: d.setdefault(key,[v,key+1])
    else: d.setdefault(key,[v,0])             
e=100
jump=(0+k)%n
e-=1
if d[jump][0]=='1': 
    e-=2
i=jump
while jump!=0:
    jump=(i+k)%n
    e-=1
    if d[jump][0]=='1': e-=2 
    i=jump  
print(e)