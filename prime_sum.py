import random
def is_probable_prime(n, k = 7):
    if n < 6:  
        return [False, False, True, True, False, True][n]    
    elif n & 1 == 0:
        return False    
    else:
        s, d = 0, n - 1
        while d & 1 == 0:
            s, d = s + 1, d >> 1
    for a in random.sample(range(2, n - 2), min(n - 4, k)):
        x = pow(a, d, n)
        if x != 1 and x + 1 != n:
            for r in range(1, s):
                x = pow(x, 2, n)
                if x == 1:
                    return False 
                elif x == n - 1:
                    a = 0  
                    break        
            if a:
                return False
    return True
T = int(raw_input())
for _ in range(T):
    N, K = list(map(int, raw_input().split()))        
    if N < 2 * K:
        print('No')        
    elif K == 1:
        print('Yes' if is_probable_prime(N) else 'No')        
    elif K == 2:
        if N % 2 == 0:
            print('Yes')
        else:
            print('Yes' if is_probable_prime(N - 2) else 'No')
    else:
        print('Yes')