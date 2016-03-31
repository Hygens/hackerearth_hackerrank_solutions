import itertools  
l = []   
N,Q = map(int, raw_input().split())  
s=sorted(map(int,raw_input().split()),reverse=True)  
ln=len(s)  
l = sum([map(list, itertools.combinations(s, i)) for i in range(ln + 1)], [])
l[0]=[0]
l=sorted([x[0] for x in l],reverse=True)
while(Q>0):
    inp = raw_input()
    opr = inp[0]
    oprnd = int(inp[2:])
    count=0     
    if(opr=='<'): 
        count=len(filter(lambda x: x<oprnd,l))            
    if(opr=='>'):  
        count=len(filter(lambda x: x>oprnd,l))
    if(opr=='='):  
        count=len(filter(lambda x: x==oprnd,l))
    print count  
    opr=''
    Q-=1 