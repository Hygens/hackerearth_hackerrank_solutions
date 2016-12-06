T = int(input().strip())
for _ in range(T):
    print('EVEN' if int(input().strip()[::-1])%2==0 else 'ODD')
