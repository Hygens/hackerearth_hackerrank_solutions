from sys import stdin,stdout
from asyncio import Queue
suma = 0
harrys = Queue()
monks = []
n = int(stdin.readline().strip())
for x in stdin.readline().split(' '):
    num = int(x)
    harrys.put_nowait(num)
Q,target = map(int,stdin.readline().split(' '))
res = -1
if suma == target:
    res = 0
else:
    for q in range(Q):
        op = stdin.readline().strip()        
        if op == "Harry":
            num = harrys.get_nowait()
            monks.append(num)
            suma += num
        else:
            num = monks.pop()
            suma -= num        
        if suma == target:
            res = monks.__len__()
            break
stdout.write(str(res)+'\n')
