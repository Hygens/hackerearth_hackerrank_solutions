from math import factorial as fact
import re
c, k = map(int,re.split('[\\s]+',input().strip()))
while c!=0 and k!=0:
    try:                  
        e = fact(c)//(fact(k)*fact(c-k))                           
        print('%d things taken %d at a time is %d exactly.' %(c,k,e))       
        c, k = map(int,re.split('[\\s]+',input().strip()))                   
    except (EOFError):
        break