vals = input().strip()
st = dict() ; s=0; cnt=0
while vals!='-1':
    v, w, c = vals.split(' ')
    if st.__contains__(w):
        if c=='right':
            st[w]['right']+=int(v) 
            cnt+=1           
        elif c=='wrong':
            st[w]['wrong']+=20        
    else:
        if c=='right':
            st[w]={'right':int(v),'wrong':0}
            cnt+=1  
        else:
            st[w]={'right':0, 'wrong':20}
                      
    vals = input().strip()

for v in st.values():
    if v['right']>0:
        s+=v['right']+v['wrong']
    
print(str(cnt)+' '+str(s))
    

      
    

    