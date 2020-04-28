from collections import Counter
t = int(input())
for i in range(1,t+1):
    g = int(input())
    d = Counter(map(int,input().split(' ')))
    e = list(filter(lambda k: 1==k[1],d.items()))
    print('Case #'+str(i)+': '+str(e[0][0]))


    
    
   
    