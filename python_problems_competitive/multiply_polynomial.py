from sys import stdin,stdout

t = int(stdin.readline())
while t>0:
    g1 = int(stdin.readline())
    p1 = list(map(int,stdin.readline().strip().split(' ')))
    g2 = int(stdin.readline())
    p2 = list(map(int,stdin.readline().strip().split(' '))) 

    res = [0]*(len(p1)+len(p2)-1)
    for o1,i1 in enumerate(p1):
        for o2,i2 in enumerate(p2):
            res[o1+o2] += i1*i2
            
    stdout.write(str(len(res)-1)+'\n')
    stdout.write(' '.join(map(str,res))+'\n')
    
    t-=1

    