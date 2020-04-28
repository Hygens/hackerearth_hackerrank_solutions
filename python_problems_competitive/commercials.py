def step1(a):
    max_ending_here = max_so_far = 0
    for x in a:
        max_ending_here = max(0, max_ending_here + x)
        max_so_far = max(max_so_far, max_ending_here)
    return max_so_far

n, p = map(int, input().strip().split(' '))
sts = map(lambda x: int(x) - p, input().strip().split(' '))
print (step1(sts))