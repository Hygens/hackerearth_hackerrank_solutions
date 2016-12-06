from sys import stdin,stdout
T = int(stdin.readline().strip())
for _ in range(T):
    n = int(stdin.readline().strip())
    if n == 0:
        stdout.write('0\n')
    else :
        res = 1
        while n > 0: 
            if n % 2 == 0: 
                res *= 2            
            n /= 2        
        stdout.write(str(res - 1)+'\n')
    

