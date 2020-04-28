n = int(input().strip())
while n:    
    l = [input().strip() for _ in range(n)]
    l =sorted(l, key=lambda s: s[:2])
    print('\n'.join(l))
    print('')
    n = int(input().strip())
    if n==0: break