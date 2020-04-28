from sys import stdin,stdout
n,q = map(int,stdin.readline().split(' '))
arr = [int(x) for x in stdin.readline().strip().split(' ')]
for _ in range(q):
    q,x,y = [x for x in stdin.readline().strip().split(' ')]
    x = int(x) ; y = int(y)
    if q=='q': stdout.write(str(min(arr[x-1:y]))+'\n')
    else: arr[x-1]=y
