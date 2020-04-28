from math import ceil
T = int(input().strip())
for _ in range(T):
    n = int(input().strip())    
    nums = list(sorted(map(int,input().split(' '))))    
    pre,now,count,streak = 0,0,0,0
    for i in range(n):
        now = nums[i]
        if now == pre:
            continue        
        if pre == 0:
            streak = 1
        else:
            if now + 1 == pre or now - 1 == pre:
                streak += 1
            else:
                count += int(ceil(streak / 2))
                streak = 1        
        pre = now   
    count += int(ceil(streak / 2))
    print(count)