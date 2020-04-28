n, k = map(int, input().strip().split(' '))
n-=1 ; print(n) if n<k*2 else print (k + n%k + 1)