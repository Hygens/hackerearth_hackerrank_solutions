from datetime import timedelta

n = int(input().strip())
for _ in range(n):
    acao,v,h,m = input().strip().split(' ') 
    di = timedelta(hours=int(h),minutes=int(m))
    df = timedelta(minutes=int(v))
    if acao=='F': tdelta = di + df
    else: tdelta = di - df    
    seconds = tdelta.total_seconds()
    hours = int(seconds // 3600)
    minutes = int((seconds % 3600) // 60)
    if hours==24: hours=0
    elif hours<0: hours=24+hours
    print(str(hours)+' '+str(minutes))
    
   

        
                      
   

    

      
    

    