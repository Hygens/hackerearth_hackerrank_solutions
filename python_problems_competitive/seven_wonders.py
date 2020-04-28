from collections import Counter
d = Counter(input())
t = d['T']**2 
c = d['C']**2
g = d['G']**2
if t>0 and c>0 and g>0: r = t + c + g + min(d.values())*7
else: r = t + c + g
print(r)

      
    

    