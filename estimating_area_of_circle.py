from math import pi
v = input()
while v!='0 0 0':
    r,m,c = map(float,v.split(' '))
    acr = r**2*pi
    ace = ((2*r)**2)*(c/m) 
    print('%.5f %.5f' %(acr,ace))
    v = input()
    
   
    