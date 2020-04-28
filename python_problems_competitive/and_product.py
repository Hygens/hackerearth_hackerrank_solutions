T = int(input())
for _ in range(T):
    A, B = list(map(int, input().split()))
    x = 0
    while (A | x) < B:
        x = (x << 1) | 1
    print(A & ~x)