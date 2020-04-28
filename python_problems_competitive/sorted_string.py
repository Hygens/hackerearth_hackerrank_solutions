T = int(input().strip())
for _ in range(T):
    s = input().strip()
    s = sorted(s)
    print(''.join(sorted(s, key=lambda x: s.count(x))))
