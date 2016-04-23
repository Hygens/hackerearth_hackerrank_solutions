import re
N=int(raw_input())
regext=r'^(?>![\\w+])(?:https?:\/\/www.)|^(?:\/?\/?www.)?(?:\/\/)?([^\/\?]+)(?![\\w+])'
domains=[]
while (N>0):
    line=raw_input()
    r=re.findall(regext, line)
    if r: domains.extend(r)
    N-=1
domains.sort(cmp=None, key=None, reverse=False)
out=''
for x in range(0,len(domains)):
    if x<len(domains)-1:
        out+=str(domains[x])+';'
    else:
        out+=domains[x]
print(out)
    
    
    