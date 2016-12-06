w, _ = map(int, input().split(' '))
plist = [0] + list(map(int, input().split(' ' ))) + [w]
res = []
for i in range(1, len(plist)):
    for j in range(i-1,-1, -1):
        res.append(plist[i] - plist[j])
print(' '.join(list(map(str, sorted(set(res))))))
    
