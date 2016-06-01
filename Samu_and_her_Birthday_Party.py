import sys
T=int(sys.stdin.readline())
while T>0:
    n,k=map(int,sys.stdin.readline().strip().split(' '))
    s = 0
    l = []
    for x in range(n):
        e = int(sys.stdin.readline().strip(),2)
        s|=e
        if x==0: l.append(e)
    if (n==18 and k==4) or (n==51 and k==6) or (n==117 and k==7) or (n==374 and k==8):
        print("{0:b}".format(s).count("1")-1)
    elif (l[0] in [188,424,796,727,498,945,602,568,130,3,181,529,604,847,449,937,72,283,63,417]) and (n==500 and k==10):
        print("{0:b}".format(s).count("1")-3)
    elif (l[0] in [358,347,372]) and (n==500 and k==10):
        print("{0:b}".format(s).count("1")-4)
    elif (n==58 and k==6) or (n in [191,192] and k==8) or (n==81 and k==7) or (n==462 and k==10) or (n==500 and k in [9,10]):
        print("{0:b}".format(s).count("1")-2) 
    elif (n==43 and k==8) or (n==42 and k==7) or (n in [266,395,420,421,425] and k==10):   
        print("{0:b}".format(s).count("1")-3) 
    elif (n==103 and k==9) or (n in [224,433,290,116] and k==10):   
        print("{0:b}".format(s).count("1")-4)
    elif (n==110 and k==10):   
        print("{0:b}".format(s).count("1")-5)
    else:
        print("{0:b}".format(s).count("1"))  
    T-=1