preludes = {'A':'UNIQUE', 'A#':'Bb','B':'UNIQUE','C':'UNIQUE','C#':'Db','D':'UNIQUE','D#':'Eb','E':'UNIQUE','F':'UNIQUE','F#':'Gb','G':'UNIQUE','G#':'Ab'}
case = 1 
inp = input()
while inp: 
    try:
        a,b = inp.split(' ')
        if preludes.__contains__(a) and preludes[a]=='UNIQUE':
            print('Case %i: %s' %(case, preludes[a]))
        elif preludes.__contains__(a): 
            print('Case %i: %s %s' %(case, preludes[a],b))   
        else:
            for k,v in preludes.items():
                if v==a: print('Case %i: %s %s' %(case, k, b)) ; break
        inp=input()
        case+=1
    except (EOFError):
        break 
    
    
   
    