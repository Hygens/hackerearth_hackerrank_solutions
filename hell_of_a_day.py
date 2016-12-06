from sys import stdin,stdout
N = int(stdin.readline().strip())
eCount=0 ; oCount=0 ; it=0
ev = [] ; od = []
for temp in stdin.readline().strip().split(' '):
    temp = int(temp)
    if temp%2==0:
        ev.append(temp)        
    else:
        od.append(temp)
eCount=len(ev) ; oCount=len(od)
ev = sorted(ev) ; od = sorted(od)
for i in range(0,eCount):
    stdout.write(str(ev[i])+" ")
    it=i
stdout.write("\n")
for i in range(oCount-1,0,-1):
    stdout.write(str(od[i])+" ")
    it=i
stdout.write(str(od[it-1]))
   
    