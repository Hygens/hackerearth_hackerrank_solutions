n, d = map(int, input().strip().split(' '))
while n+d!=0:        
    print ("{} {} / {}".format(n//d, n%d, d))
    n, d = map(int, input().strip().split(' '))