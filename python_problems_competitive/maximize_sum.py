from itertools import combinations
T=int(raw_input())
N,M=map(int,raw_input().split())
L=map(int, raw_input().split())
total = 0 ; k = 0 
for li in range(0, len(L)+1):
    for l in combinations(L, li):
        if not total: 
            total=sum(l)%M            
        else:
            k=sum(l)%M
            if k>total: total=k 
print (total)