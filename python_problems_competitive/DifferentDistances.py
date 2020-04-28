v = input().strip()
d = 0.0
while v!='0':
    try:
        x1,y1,x2,y2,p = map(float,v.split(' '))
        d=(abs(x2-x1))**p+(abs(y2-y1))**p
        if p>1.0: d = d**(1/p) 
        print('%.10f' %(d))
        v = input().strip()
    except EOFError:
        break
    except TypeError:
        break
   
    