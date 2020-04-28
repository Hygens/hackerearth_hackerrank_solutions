import sys
def countWays(amount_cents, coins):
    n = len(coins)
    cycle = max([c+1 for c in coins if c <= amount_cents]) * n
    table = [0] * cycle
    for i in xrange(n):
        table[i] = 1 
    pos = n
    for s in xrange(1, amount_cents + 1):
        for i in xrange(n):
            if i == 0 and pos >= cycle:
                pos = 0
            if coins[i] <= s:
                q = pos - coins[i] * n
                table[pos]= table[q] if (q >= 0) else table[q + cycle]
            if i:
                table[pos] += table[pos - 1]
            pos += 1
    return table[pos - 1]//2
t=int(sys.stdin.readline().strip())
s = 0
while t>0:
    k,m = map(int,sys.stdin.readline().strip().split(' '))
    ch = map(int,sys.stdin.readline().strip().split(' '))
    print(countWays(m,ch)%1000000007)
    t-=1
    