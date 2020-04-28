def nextHighest(seq):
    L = []
    size = len(seq)
    if size==1 or size==2: return 0
    elif size==3:
        l = 1 if seq[0]>seq[1] else 0
        r = 3 if seq[2]>seq[1] else 0
        L.append(l*r)
    else:
        for i in range(1,size):
            l = next((j+1 for j in range(i,-1,-1) if seq[j]>seq[i]),0)
            r = next((j+1 for j in range(i,size) if seq[j]>seq[i]),0)
            L.append(l*r)
    if len(L)>0: return max(L)
    else: return 0
n = int(input().strip())
print(nextHighest(list(map(int,input().split(' ')))))

