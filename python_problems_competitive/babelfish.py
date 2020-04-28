d = {}
s = input().strip()
while s:    
    eng, foreign = s.split(' ')
    d[foreign] = eng
    s = input().strip()
s = input().strip()
while s:
    try:
        print (d.get(s, 'eh'))
        s = input().strip()
    except (EOFError):
        break
    