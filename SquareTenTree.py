n = 10**6 + 5;
l, r, m = ' '*n, ' '*n, ' '*n
k=0
def sp_prx(t):
    size = 1 ; sizev = 0 ; rg = k-1    
    res = []
    while rg >= 0: 
        lf = max(0, rg - size + 1)
        fnz = -1
        for i in range(lf,rg+1):        
            if t[i] != '0': 
                fnz = i
                break            
        if fnz != -1:
            res.append([sizev, t[fnz:rg + 1]])
        size += size
        if sizev == 0: size = 1
        sizev+=1
        rg = lf - 1    
    return res[::-1]

l, r = input().strip(),input().strip()
k = len(r)
o = len(l)

for i in range(k):
    if o - i - 1 < 0:
        l = l[:k - i - 1] + '0' + l[k - i:]
    else:
        l = l[:k - i - 1] + l[o - i - 1] + l[k - i:]        
    m = m[:i] + '0' + m[i+1:]

for j in range(k - 1,-1,-1): 
    if l[j] != '0':
        l=l[:j]+chr(ord(l[j])-1)+l[j+1:]
        break
    l=l[:j]+'9'+l[j+1:]    

lcp = 0
while lcp < k and l[lcp] == r[lcp]:
    lcp+=1

res, tmp = [], []
rg = k - 1
size = 1
sizev = 0
while rg >= 0: 
    lf = max(0, rg - size + 1);

    if lf <= lcp: break

    fnz = -1
    for x in range(lf,rg+1):
        m = m[:x] + r[x] + m[x+1:]
        r= r[:x] + '0' + r[x+1:]  

    rg = lf - 1;
    size += size;
    if sizev == 0: size = 1;
    sizev+=1

rem = 0
for y in range(k-1,-1,-1):
    r = r[:y] + chr(ord(r[y]) + rem - ord(l[y])) + r[y+1:]
    rem = 0
    if ord(r[y]) < 0:
        rem = -1
        r = r[:y] + chr(ord(r[y])+10) + r[y+1:]    
    r = r[:y] + r[y] + '0' + r[y+1:] 

res = sp_prx(r)
res = res[::-1]
tmp = sp_prx(m)

for z in range(len(tmp)):
    res.append(tmp[z+1])

print(res)
print(len(res))
for d,s in res:
    print('%d %s' %(d,s))
   
    
