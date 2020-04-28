from fractions import gcd
N = int(input())
for x in range(0, N):
    line = map(int,raw_input().split())
    a = line[0] ; b = line[1] ; c = line[2] ;  d = line[3]
    result = gcd(abs(c - a), abs(d - b)) - 1
    print(result)