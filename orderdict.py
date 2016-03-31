from collections import OrderedDict
d=OrderedDict()
for _ in range(int(input())):
    a=input().split()
    n=int(a.pop())
    key= " ".join(a)
    if key in d:
        d[key] += n
    else:
        d[key] = n   
for k in d:
    print(k+' '+str(d[k]))