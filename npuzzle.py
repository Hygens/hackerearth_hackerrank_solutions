matrix = [
    ['A','B','C','D'],
    ['E','F','G','H'],
    ['I','J','K','L'],
    ['M','N','O','.'],
]
layout = {}
for i in range(4):
    for j in range(4):
        layout[matrix[i][j]] = (i,j)
def mhtn(x1, y1, x2, y2):
    return abs(x2-x1)+abs(y2-y1)
inplayout = [];
for i in range(4):
    inplayout.append(list(input()))
r = 0
for i in range(4):
    for j in range(4):
        if inplayout[i][j] != '.':
            r+=mhtn(i,j,*layout[inplayout[i][j]])
print(r)