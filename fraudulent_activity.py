from collections import deque
n,d=map(int,input().split(' ')) 
l = list(map(int,input().split(' ')))
lm = list(sorted(l))
dq = deque(lm)
notif = 0
odd = d % 2 != 0
mdn = 0
for i in range(n-d):
    if i == 0: 
        if odd: mdn = dq[d//2]
        else: mdn = (dq[d//2-1]+dq[d//2])/2   
    else:
        dq.popleft(); dq.pop() 
        dq.appendleft(lm[i]); dq.append(lm[d+i])
        if odd: mdn = dq[d//2+1]
        else: mdn = (dq[d//2]+dq[d//2+1])/2
    expend = float(mdn*2)
    notif += 1 if float(l[d+i])>=expend else 0   
print(notif)