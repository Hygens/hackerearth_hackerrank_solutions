import sys
from difflib import ndiff
n,k = map(int,sys.stdin.readline().strip().split(' '))
s = sys.stdin.readline().strip()
l=[x.strip() for x in filter(lambda x: x.find('+')!=-1,list(ndiff(s[::-1],s)))]
if float(len(l))/2>k: print('-1')
else:
    while k>0 and s!='-1':
        if s!=s[::-1] and n%2==0:
            a = int(s[0:n/2]) ; p = int(s[n/2:][::-1])
            if a > p: 
                diff= a-p
                p = str(p+diff)[::-1]
                s = str(a) + p  
            else:
                diff= p-a
                a = str(a+diff)
                s = a + str(p)[::-1]
        else:
            a = s[0:n/2] ; p = s[n/2+1:][::-1]
            if a==p and int(s[n/2+1])<=9:
                s = a + '9' + p               
            else:
                a = int(a) ; p = int(p)
                if a > p: 
                    diff= a-p
                    if (diff<10):
                        p = str(p+diff)[::-1]
                        s = str(a) + '9' + p 
                    else: s='-1'                   
                else:
                    diff= p-a
                    a = str(a+diff)
                    s = a + s[n/2+1] + str(p)[::-1]
        k-=1                      
    print(s) 