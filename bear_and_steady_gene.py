from difflib import ndiff
from collections import Counter
n= int(raw_input())
# chars=+"C"*(n/4)+"G"*(n/4)+"T"*(n/4)
s = sorted(raw_input(), key=str.upper)
# s=raw_input()
cnt= Counter(s) 
r=0
chars=""
if cnt['A']>0: chars+="A"*(n/4)
else: r+=n/4
if cnt['C']>0: chars+="C"*(n/4)
else: r+=n/4
if cnt['T']>0: chars+="T"*(n/4)
else: r+=n/4
if cnt['G']>0: chars+="G"*(n/4)
else: r+=n/4
g=Counter(list(ndiff(s,chars)))
print(g)
for (k,e) in g.iteritems():
    if "+" in k: r+=e 
print(r)

# from collections import Counter
# n= int(raw_input())
# x=n/4
# s = raw_input()
# l=Counter(s)
# print(l)
# r=0
# if l['A']==0: r+=x+x/2
# elif l['A']<x: r+=x-l['A']
# if l['C']==0: r+=x+x/2
# elif l['C']<x: r+=x-l['C']
# if l['T']==0: r+=x+x/2
# elif l['T']<x: r+=x-l['T']
# if l['G']==0: r+=x+x/2
# elif l['G']<x: r+=x-l['G']
# print(r)