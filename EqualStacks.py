import sys
cylinders = map(int,sys.stdin.readline().strip().split(' '))
cylStack = []
heights = [0,0,0]
for i in range(3):
    vals = map(int,sys.stdin.readline().strip().split(' '))
    cylStack.append(vals)
    heights[i] = sum(vals)
idxArr = [0,0,0]
target = min(min(heights[0], heights[1]),heights[2])
while heights[0] != heights[1] or heights[1] != heights[2]:
    for i in range(3):
        if heights[i] > target:
            heights[i] -= cylStack[i][idxArr[i]]; idxArr[i]+=1
            target = min(target, heights[i])
print(target)