import math
from sys import stdin,stdout
y = int(stdin.readline().strip())
while y!=0:
    t = (y-1960) // 10
    b = 4 << t
    r = 0
    i = 2
    while True:
        aux = math.log(i, 2)
        if math.ceil(r+aux) > b: break
        i+=1
        r += aux
    stdout.write(str(i-1)+'\n')
    y = int(stdin.readline().strip())
    
