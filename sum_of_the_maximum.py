from itertools import combinations
n,m=map(int,raw_input().strip().split(' '))
a=sorted(map(int,raw_input().strip().split(' ')))
soma=0
for i in range(m):
    l,r=map(int,raw_input().strip().split(' '))
    lbd=(lambda x: x>=l and x<=r)
    for subseq in sum([map(list,combinations(a,i)) for i in range(n+1)],[]):
        if len(subseq)>1:
            f=filter(lbd,subseq)
            if f: soma+=max(f) 
        elif len(subseq)==1:
            f=filter(lbd,subseq)
            if f: soma+=max(f)
    print(soma)
    soma=0