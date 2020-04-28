n = int(input().strip())
live = [1]*n
line = input().strip()
k = len(line); i,now = 0,0
while True:
    ch = line[i]
    if ch == 'b':
        live[now] = 0    
    nxt = now
    while(True):
        nxt += 1
        nxt %= n
        if live[nxt] or nxt == now:
            break;    
    if nxt == now:
        break    
    now = nxt
    i += 1
    i %= k
print(now + 1)