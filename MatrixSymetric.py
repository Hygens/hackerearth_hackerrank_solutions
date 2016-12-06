T = int(input().strip())
for _ in range(T):
    n = int(input().strip())
    matrix = []
    for _ in range(n):
        matrix.append(input().strip())    
    h,v = 1,1
    for i in range(n // 2):
        for j in range(n):
            if matrix[i][j] != matrix[n - 1 - i][j]:
                h = 0
                break        
        if h==0:
            break   
    for j in range(n // 2):
        for i in range(n):
            if matrix[i][j] != matrix[i][n - 1 - j]:
                v = 0
                break        
        if v==0:
            break    
    res = ''
    if h and v:
        res = "BOTH"
    elif h:
        res = "HORIZONTAL"
    elif v:
        res = "VERTICAL"
    else:
        res = "NO"    
    print(res)
