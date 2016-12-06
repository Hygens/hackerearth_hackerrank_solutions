from collections import deque
l = deque()
q = int(input().strip())
for _ in range(q):
    s = input().strip()
    if s[0]=='1': l.append(s.split(' ')[1])
    elif s[0]=='2': l.popleft()
    else: print(l[0])