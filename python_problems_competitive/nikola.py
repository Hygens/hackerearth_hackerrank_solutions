MAX_LIMIT = 1000
MAX_INF = 100000
sqr =[[0]*(MAX_LIMIT+1)]*(MAX_LIMIT+1)
tmp = []
def result(x,y):
    if x < 0 or x > tmp.__len__() - 1: return MAX_INF  
    v = sqr[x][y]  
    if x == len(tmp)-1: return tmp[x] - tmp[0]
    if v == -1:  
        c1 = tmp[x] + result(x+y+1, y+1)
        c2 = tmp[x] + result(x-y, y) if (y != 0) else MAX_INF
        v = min(c1, c2)    
    return v

n = int(input().strip())
for i in range(n):
    for j in range(n): sqr[i][j]=-1
for _ in range(n): tmp.append(int(input().strip()))
smallest = result(0,0)
print(smallest)

    

