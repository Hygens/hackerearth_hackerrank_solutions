import sys
x1,v1,x2,v2=map(long,sys.stdin.readline().strip().split(' '))
if (x1==x2) and (v1==v2): print("YES")
elif (v1==v2 and x1!=x2) or (x1==x2 and v1!=v2): print("NO")
else:
    n=((x2-x1)/(v1-v2))+1
    an1=x1+v1*(n-1)
    an2=x2+v2*(n-1)
    if n>0 and v1!=v2 and an1==an2: print("YES")
    else: print("NO")