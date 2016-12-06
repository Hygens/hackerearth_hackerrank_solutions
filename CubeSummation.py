from collections import OrderedDict
t = int(input().strip())
for _ in range(t):
    n,m = map(int,input().split(' ')) 
    d = OrderedDict()
    for _ in range(m):
        inp = input().split(' ')
        if inp[0]=='UPDATE': 
            x,y,z,w = map(int,inp[1:])
            d[x,y,z]=w
        else:
            x1,y1,z1,x2,y2,z2 = map(int,inp[1:])
            t1=x1,y1,z1 ; t2=x2,y2,z2
            print(sum(e for k,e in d.items() if x1<=k[0]<=x2 and y1<=k[1]<=y2 and z1<=k[2]<=z2)) 