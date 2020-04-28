n = int(input().strip())
for j in range(1,n+1):
    m = int(input().strip())
    v1 = map(int, input().strip().split(' '))
    v2 = map(int, input().strip().split(' '))
    v1 = sorted(v1)
    v2 = sorted(v2, reverse=True)
    print ('Case #%s: %s' % (j, sum(v1[i]*v2[i] for i in range(m))))