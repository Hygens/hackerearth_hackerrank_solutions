import datetime
months = {'January':1,'February':2,'March':3,'April':4,'May':5,'June':6,'July':7,'August':8,'September':9,'October':10,'November':11,'December':12}
t = int(input().strip())
for _ in range(t):
    day, month, year = input().split(' ')
    print((datetime.date(int(year), months[month], int(day)) - datetime.timedelta(1)).strftime("%-d %B %Y"))

    

        
                      
   

    

      
    

    