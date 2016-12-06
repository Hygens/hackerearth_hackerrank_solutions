from math import factorial as fact
import re
b = input().strip()
while b:
    try: 
        c,k = map(int,re.split('[\\s]+',b))         
        e = (fact(2*k)//(fact(k)*fact(k)*(k+1)))*(k+1)                           
        print('%d' %(len(str(e))))       
        b = input().strip()                   
    except (EOFError):
        break