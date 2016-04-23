MOD = 1000000007
N = list(map(int, list(raw_input().strip())))
total = 0 ; k = 1
for i, digit in enumerate(reversed(N)):
    total += k * digit * (len(N) - i) % MOD ; k = ((10 * k) + 1) % MOD
print(total % MOD)