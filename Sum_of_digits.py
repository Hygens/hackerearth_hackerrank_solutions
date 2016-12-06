from collections import defaultdict
a,b,s = map(int,input().split(' '))
cnt = 0
mini = 0
d = defaultdict()
for x in range(a,b+1):
    suma = eval('+'.join(str(x)))
    if suma==s: 
        cnt += 1
        d[x] = suma   
print(cnt) ; print(min(d.items(), key=lambda x: x[0])[0])