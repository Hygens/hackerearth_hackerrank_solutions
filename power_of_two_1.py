T = int(input().strip())
for _ in range(T):
    n = int(input().strip())
    nums = [int(x) for x in input().strip().split(' ')]
    found = 0
    for pos in range(33):
        res = -1
        for i in range(n):
            if (nums[i] >> pos) % 2 == 1:
                if res == -1:
                    res = nums[i]
                else:
                    res = res & nums[i]        
        if res > 0:
            tmp = 1
            for i in range(pos):
                tmp = tmp * 2           
            if res == tmp:
                found = 1
                break        
        
    print("YES" if found else "NO");