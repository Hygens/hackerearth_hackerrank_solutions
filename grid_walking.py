MOD = 1000000007
def choose(n, k):
    if k < 0 or k > n:
        return 0    
    else:
        p, q = 1, 1         
        for i in range(1, min(k, n - k) + 1):
            p *= n
            q *= i
            n -= 1         
        return p // q
def count_ways(N, M, D):
    ways = [[[0] * D[i] for _ in range(M + 1)] for i in range(N)]
    for i in range(N):        
        for j in range(D[i]):
            ways[i][0][j] = 1            
            if j > 0:
                ways[i][1][j] += 1
            if j < D[i] - 1:
                ways[i][1][j] += 1        
        for s in range(2, M + 1):
            for j in range(D[i]):
                if j > 0:
                    ways[i][s][j] += ways[i][s - 1][j - 1]
                if j < D[i] - 1:
                    ways[i][s][j] += ways[i][s - 1][j + 1]    
    return ways
T = int(raw_input())
c = {}
for _ in range(T):
    N, M = list(map(int, raw_input().split()))
    X = list(map(int, raw_input().split()))
    D = list(map(int, raw_input().split()))    
    ways = count_ways(N, M, D)
    total = [ways[0][i][X[0] - 1] for i in range(M + 1)]
    for i in range(1, N):
        for j in reversed(range(1, M + 1)):
            k = j            
            while k >= 0 and (j, k) not in c:
                c[(j, k)] = choose(j, k)
                k -= 1            
            total[j] = sum(total[k] * c[(j, k)] * ways[i][j - k][X[i] - 1] for k in range(j + 1))
    print(total[M] % MOD)