from sys import stdin
n,k = [int(x) for x in stdin.readline().split(' ')]
l = [int(x) for x in stdin.readline().split(' ')]
m = 1000000007
k2 = (k*k)%m
sa,sb,sc = 0,0,0
for i in range(k):
    sa = (sa + l[i])%m
    sb = (sb + ((i + 1) * l[i])%m)%m
    sc = (sc + (((i + 1) * (i + 1))%m * l[i])%m)%m
print('%i%s' %(sc, '\n' if k == n else ' '),end='')
for j in range(1,n-k+1):
    sc = (sc - 2 * sb + sa + (k2 * l[j + k - 1])%m)%m;
    sb = (sb - sa + (k * l[j + k - 1])%m)%m
    sa = (sa - l[j - 1] + l[j + k - 1])%m
    if sa < 0:
        sa += m    
    if sb < 0:
        sb += m    
    if sc < 0:
        sc += m    
    print('%i%s' %(sc, '\n' if j == n - k else ' '), end='')
   

    

