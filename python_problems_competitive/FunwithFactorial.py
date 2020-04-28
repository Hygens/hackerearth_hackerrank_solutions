from math import factorial as fact
t = int(input().strip())
for _ in range(t):
    n = int(input().strip())
    if n<25:
        print('%5.5d' %(fact(n)%100000))
    else: print('00000')