from datetime import datetime

s = input().strip()
while s:
    try:
        desc = s.split(' ') 
        FMT = '%H:%M'
        di = datetime.strptime(desc[-2],FMT)
        df = datetime.strptime(desc[-1],FMT)
        tdelta = df - di
        seconds = tdelta.total_seconds()
        hours = int(seconds // 3600)
        minutes = int((seconds % 3600) // 60)
        print(' '.join(desc[:-2])+' '+str(hours)+' hours '+str(minutes)+' minutes')
        s = input().strip()
    except (EOFError):
        break

        
                      
   

    

      
    

    