from itertools import combinations
class Point:
    def __init__(self, x, y, v):
        self.x, self.y, self.v = x, y, v    
    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__
    def __ne__(self, other):
        return not self.__eq__(other)
N = int(raw_input())
points = [Point(*list(map(int, raw_input().split()))) for _ in range(N)] 
max_weight = 0
best_weight = lambda a, b: max(max_weight, min(a, b))
det = lambda a, b, c: (b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x)
for a, b in combinations(points, 2):
    above, below = 0, 0        
    for c in (p for p in points if p != a and p != b):
        if det(a, b, c) > 0:
            above += c.v
        else:
            below += c.v        
    max_weight = best_weight(above + a.v + b.v, below)
    max_weight = best_weight(above + a.v, below + b.v)
    max_weight = best_weight(above + b.v, below + a.v)
    max_weight = best_weight(above, below + a.v + b.v)    
print(max_weight)