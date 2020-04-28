from sys import stdin,stdout
n = int(stdin.readline().strip())
ws = [stdin.readline().strip() for x in range(n)] 
for i in range(n):
    r = 0
    for j in range(i):
        if ws[j]<ws[i]:
            r += 1       
    stdout.write(str(r)+'\n')
