from sys import stdin,stdout
T = int(stdin.readline().strip())
colors = [['']*5]*20
colorsNum = 0;
counts = [0]*5
if T == 0:
    for i in range(5):
        counts[i] = 1
for _ in range(T):
    vals = stdin.readline().split(' ')
    n,color,nums = int(vals[0]),vals[1],[int(x) for x in vals[2:]]   
    seen = False
    for i in range(colorsNum):
        if colors[i]==color:
            seen = True
            break  
    if seen:
        continue
    else:
        colors[colorsNum]=color
        colorsNum+=1    
    for i in range(5):
        seen = False
        for j in range(n):
            if nums[j] == i + 1:
                seen = True
                break        
        if seen:
            counts[i] += 1
        else:
            counts[i] -= 1
for i in range(5):
    if counts[i] <= 0:
        stdout.write("NO\n")
    elif counts[i] == 1:
        stdout.write("UNDEFINED\n");
    else:
        stdout.write("YES\n")
    