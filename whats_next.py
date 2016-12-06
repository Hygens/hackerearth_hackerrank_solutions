import re
def binSearch(x):
    small = x & -x
    rip = x + small
    ones = x ^ rip
    ones = (ones>>2)//small
    return rip | ones

t = int(input().strip())
for _ in range(t):
    n = int(input().strip())
    nums = list(map(int,input().split(' ')))
    s = ''
    for i in range(n,0,-1):
        if i%2!=0: s+='1'*nums[i]
        else: s+='0'*nums[i]
    x = bin(binSearch(int(s,2)))[2:]
    r = list(filter(lambda x: x!='',re.split('([0]+|[1]+)',x)))
    size = len(r)
    r =list(map(str,map(len,r)))
    print(size)    
    print(' '.join(r))
        
        