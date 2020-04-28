t = int(input().strip())
while t>0:
    input()
    n = int(input().strip())
    candies = 0
    tmp = n
    while tmp>0:
        candies += int(input().strip()) ; tmp-=1
    if candies%n == 0:
        print ('YES')
    else:
        print ('NO')
    t-=1