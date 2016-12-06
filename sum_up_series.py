T = int(input().strip())
for _ in range(T):
    firsts, sec, ascii = [], [], [0]*101    
    i = 0
    vals = input().strip().split(' ')    
    for x in map(int,vals[1:]):
        firsts.append(x)
        ascii[firsts[i]]+=1
        i+=1    
    vals = input().strip().split(' ')
    i = 0
    for x in map(int,vals[1:]):   
        sec.append(x)
        ascii[sec[i]]+=1  
        i+=1      
    for i in range(101):    
        if ascii[i]!=0:
            print("%d " %(i),end='')    
    print('')
  
