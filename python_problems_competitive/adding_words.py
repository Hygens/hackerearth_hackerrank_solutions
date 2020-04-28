from collections import defaultdict
vals = defaultdict()
words = defaultdict()
s = input().strip()
while s:
    try:
        if s=='clear': vals.clear(); words.clear()
        else:
            inps = s.split(' ')
            if inps[0]=='def': vals[inps[2]]=inps[1]; words[inps[1]]=inps[2]
            elif inps[0]=='calc': 
                exp = ''
                res = ''
                for v in inps[1:-1]:
                    if v in ['+','-']: exp += v
                    elif words.__contains__(v): exp += words[v]
                    else: res = 'unknown' ; break                
                if res!='unknown': 
                    res = eval(exp)
                    if vals.__contains__(str(res)): print('%s %s' %(' '.join(inps[1:]),vals[str(res)]))
                    else: print('%s %s' %(' '.join(inps[1:]),'unknown'))
                else: print('%s %s' %(' '.join(inps[1:]),'unknown'))
        s = input().strip()
    except (EOFError):
        break