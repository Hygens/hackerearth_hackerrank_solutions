T = int(raw_input())
while(T > 0):
    n, k = map(int, raw_input().split())
    total = 0
    a = n // k + 1
    b = (2 * n) // k - (1 if (2 * n) % k == 0 else 0)        
    if k % 2 == 0:
        total += k * b * (b + 1) // 4 - b
    else:
        if b % 2 == 0:
            total += k * b * (b + 2) // 8 - b // 2
            total += k * b * (b + 2) // 8 - b * (k + 1) // 4
        else:
            total += k * (b - 1) * (b + 1) // 8 - (b - 1) // 2
            total += k * (b + 1) * (b + 3) // 8 - (b + 1) * (k + 1) // 4        
    total -= (b - a + 1) * ((a + b) * k - 2 * (n + 1)) // 2        
    print(total)
    T -= 1
