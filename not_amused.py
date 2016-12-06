from collections import OrderedDict
w = input().strip()
day = 1
while w:
    try:
        if w=='OPEN':
            d = OrderedDict()            
            w = input().strip() 
            while w!='CLOSE':
                a,p,t = w.split(' ')
                if d.__contains__(p):  
                    if a=='EXIT':                
                        d[p]['end']=int(t)
                        d[p]['time']=(d[p]['end']-d[p]['start'])
                        d[p]['bill']+=d[p]['time']*0.10
                    elif a=='ENTER':
                        d[p]['start']=int(t)
                else:
                    d[p]={'start':int(t),'end':0,'time':0,'bill':0}
                w = input().strip()             
            print('Day %i' %(day))
            for k,v in sorted(d.items()):
                print('%s $%.2f' %(k,v['bill']))                    
        w = input().strip()
        day+=1
    except (EOFError):
        break