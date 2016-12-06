#!/bin/python3
def main():
    def sum_factorial(val, b=None):
        b = val if b is None else b
        return (val * (val+1) // 2) - ((val-b) * (val-b+1) // 2)
    
    def num_factorial(val, b=None):
        b = val if b is None else b
        return [val-b for b in range(b-1,-1,-1)]
    
    for t in range(int(input().strip())):
        n, k, b = [int(x) for x in input().strip().split(' ')]
        if sum_factorial(k, b) < n or sum_factorial(b) > n:
            print(-1)
            continue
    
        spagheets = sum_factorial(k, b)
        ans = num_factorial(k, b)
        if spagheets != n:
            offset = sum(ans) - n
            indx = 0
            while offset > 0:
                orig = ans[indx]
                ans[indx] = max(indx+1, ans[indx] - offset)
                offset -= orig - ans[indx]
                indx += 1
        print(' '.join(map(str, ans)))
        
if __name__=='__main__':
    main()
       
