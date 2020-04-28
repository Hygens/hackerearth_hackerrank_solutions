from sys import stdin,stdout
t = int(stdin.readline().strip())
for _ in range(t):
    n = int(stdin.readline().strip())
    nums = [int(x) for x in stdin.readline().split(' ')]
    stack = [] ; stack.append(0)
    stdout.write('1 ')   
    for i in range(1,n):
        num = nums[i]
        while stack.__len__() > 0 and nums[stack[-1]] <= num:
            stack.pop()        
        res = i + 1
        if stack.__len__() > 0:
            res = i - stack[-1]        
        stack.append(i)
        stdout.write(str(res)+' ')    
    stdout.write('\n')

