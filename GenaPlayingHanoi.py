import sys
def reverseSortSwapCount(nums,cc=0):
    if len(nums)==0: return cc
    else:
        max_nums=max(nums)
        max_nums_idx=nums.index(max_nums)
        if max_nums_idx!=0:
            temp = nums[0]
            nums[0]=nums[max_nums_idx]
            nums[max_nums_idx]=temp
            return reverseSortSwapCount(nums[1:],cc+1)
        else:
            return reverseSortSwapCount(nums[1:],cc)      
n = int(sys.stdin.readline().strip())
nums = map(int,sys.stdin.readline().strip().split(' '))
l = [[],[],[],[],[]]
for i in range(n):
    l[nums[i]].append(i+1)
l =sum(l,[])
print(l)
print(reverseSortSwapCount(l)+1)



    