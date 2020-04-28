from math import factorial as fact
from difflib import ndiff
T = int(raw_input())
chars="AaBbCc"
p=0
while T>0:
    s = raw_input()
    l=[x.strip() for x in filter(lambda x: x=='  '+x.strip(),list(ndiff(s,chars)))]
    if not l: p=0
    elif len(l)==2: p=2
    elif len(s)>len(l): p=fact(len(s))/fact(len(l))
    elif len(l)==len(chars): p=fact(len(s))/(fact(len(s)/2)*fact(len(s)/2))+1
    elif len(s)==len(l): p=fact(len(s))/(fact(len(s)/2)*fact(len(s)/2))    
    print(p)
    T-=1