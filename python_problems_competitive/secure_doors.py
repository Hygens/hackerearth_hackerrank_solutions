n = int(input().strip())
d = dict()
for _ in range(n):
    action,name = input().split(' ') 
    if d.__contains__(name):
        if d[name]==action: 
            print(name+' entered (ANOMALY)') if action=='entry' else print(name+' exited (ANOMALY)')
        else:
           d[name]=action
           print(name+' entered') if action=='entry' else print(name+' exited')
    else:
        if action=='exit': print(name+' exited (ANOMALY)')
        else:
            d[name]=action ; print(name+' entered')
    
