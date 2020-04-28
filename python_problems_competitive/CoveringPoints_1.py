import math
import copy
import sys
from itertools import * 
class Point:       
    def __init__(self, x=0.0, y=0.0):
        self.x = x
        self.y = y        
    def __add__(self, p):        
        return Point(self.x+p.x, self.y+p.y)      
    def __sub__(self, p):        
        return Point(self.x-p.x, self.y-p.y)      
    def __mul__( self, scalar ):        
        return Point(self.x*scalar, self.y*scalar)      
    def __div__(self, scalar):        
        return Point(self.x/scalar, self.y/scalar)      
    def __str__(self):
        return "(%s, %s)" % (self.x, self.y)      
    def __repr__(self):
        return "%s(%r, %r)" % (self.__class__.__name__, self.x, self.y)       
    def length(self):
        return math.sqrt(self.x**2 + self.y**2)    
    def distance_to(self, p):
        return (self - p).length()       
    def setweight(self,w):
        self.weight = w        
    def collinear(self,b): return ((self.x*b.y-self.y*b.x)==0)

class Circle:
    def __init__(self, a, b, c=None):
        if c is None:
            # Circle(Point, scalar)
            self.center = a
            self.r = b
        else:
            # Circle(scalar, scalar, scalar)
            self.center = Point(a, b)
            self.r = c
    @property
    def r(self):
        return self._r
    @r.setter
    def r(self, new_r):
        assert new_r > 0
        self._r = new_r
    def area(self):
        return math.pi * self.r**2
    def circumference(self):
        return 2 * math.pi * self.r    

def pairwise(iterable):    
    a, b = tee(iterable)
    next(b, None)
    return zip(a, b)

n,k,a = map(int,sys.stdin.readline().strip().split(' '))
w = map(int,sys.stdin.readline().strip().split(' '))
l = []
for i in range(n): 
    x,y = map(int,sys.stdin.readline().strip().split(' '))
    p = Point(x,y) ; p.setweight(w[i])
    l.append(p) 

l = sorted(l,key=lambda p: p.weight)
g = []
s = 0
d = {}
cnt = 0
pairs = pairwise(l)
for p1,p2 in pairs:       
    if p1.collinear(p2):
        L=p1.distance_to(p2)
        A=L**2
        if ((A<=a and s<=a) 
            and len(g)<k):
            s+=A
            g.append(p1.weight+p2.weight)
            d.setdefault(cnt,'SQUARE'+' '+str(p2.x)+' '+str(p2.y)+' '+str(int(L)))
    else:
        r = p1.distance_to(p2)/2
        c = Circle(p1,r)
        ac = c.area()        
        if ((ac<=a and s<=a) and
            len(g)<k):
            s+=ac
            g.append(p1.weight+p2.weight) 
            d.setdefault(cnt,'CIRCLE'+' '+str(p1.x)+' '+str(p1.y)+' '+str(int(round(r))))
    cnt+=1     

print(len(g))
for v in d.values():
    print(v)    
    