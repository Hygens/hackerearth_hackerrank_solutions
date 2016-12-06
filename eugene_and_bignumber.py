n = int(input().strip())
for _ in range(n):
    a,n,m = input().strip().split(' ') 
    print(int(a*(int(n)))%int(m))