import sys
x=int(sys.stdin.readline().strip())
dic = {}
darshak = 1
chandan = 2
rounds = 1
d = 0
c = 0
while x>0:
    d = rounds
    if x-d>0: 
        x-=d
        c = rounds**2
        if x-c>0: 
            x-=c
            dic[rounds] = {darshak:d,chandan:c}
            rounds+=1
            c = 0
            d = 0
        else: 
            c=x
            dic[rounds] = {darshak:d,chandan:c}
            break
    else:
        d = x
        dic[rounds] = {darshak:d}
        break
if len(dic.values()[-1].values())>1: print('Chandan')
else: print('Darshak')
        
     
    
    
    