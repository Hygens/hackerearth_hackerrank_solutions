from math import sqrt
import sys
def dist((x1, y1), (x2, y2)):
    return sqrt((x1 - x2) ** 2 + (y1 - y2) **2)
l = []
num_points = int(sys.stdin.readline().strip())
for i in range(num_points):
    x,y = map(long,sys.stdin.readline().strip().split(' '))
    l.append((x,y))    
r = []
Lx=sorted(l,key=lambda x: x[0])
Ly=sorted(l,key=lambda y: y[1])
a = dist(Lx[0], Lx[-1]) ; b = dist(Ly[0],Ly[-1])
c = dist(Ly[0],Lx[-1]) ; d = dist(Lx[0],Ly[-1])
e = dist(Lx[-1],Ly[-1]) ; f = dist(Lx[0],Ly[0])
print ('%.6f' %(max([a,b,c,d,e,f])))