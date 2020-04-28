from sys import stdin,stdout
n = int(stdin.readline().strip())
arr = [int(x) for x in stdin.readline().strip().split(' ')]
q = int(stdin.readline().strip())
for _ in range(q):
    x,y,v = [int(x) for x in stdin.readline().strip().split(' ')]
    stdout.write(str(arr[x:y+1].count(v))+'\n')
