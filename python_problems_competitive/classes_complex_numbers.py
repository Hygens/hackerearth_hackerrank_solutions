def output(c):
    s=''
    if c.real: 
        s+='%.2f'%c.real
    else:
        s+='0.00'         
    if c.imag:
        if c.real:
            s+=('-' if c.imag<0 else '+')+'%.2fi'%abs(c.imag)
        else:
            if c.imag>0:
                s+='+'+'%.2fi'%c.imag
            else:
                s+='%.2fi'%c.imag 
    else:
        s+='+0.00i'
    print(s if s else '0.00+0.00i')

c,d=[complex(*map(float,input().split())) for i in range(2)]
output(c+d)
output(c-d)
output(c*d)
output(c/d)
output(abs(c))
output(abs(d))