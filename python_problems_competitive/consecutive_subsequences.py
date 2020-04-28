T = int(raw_input())
for _ in range(T):
    N, K = list(map(int, raw_input().split()))
    A = list(map(int, raw_input().split()))        
    prefix_mod = [1] + [0] * (K - 1)
    prefix = 0        
    for a in A:
        prefix = (prefix + a) % K
        prefix_mod[prefix] += 1        
    print(sum((prefix_mod[i] - 1) * prefix_mod[i] // 2 for i in range(K)))