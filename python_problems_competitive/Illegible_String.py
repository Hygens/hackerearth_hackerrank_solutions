import sys
n=int(sys.stdin.readline().strip())
s=sys.stdin.readline().strip()
ma = ''.join(s).replace('w','vv')
mi = ma.replace('vv','w')
print(str(len(mi))+ " " +str(len(ma)))