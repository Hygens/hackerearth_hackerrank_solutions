from bisect import bisect_left
def LIS(seq):
    piles = []
    for x in seq:
        new_pile = [x]
        i = bisect_left(piles, new_pile)
        if i != len(piles):
                piles[i].insert(0, x)
        else:
                piles.append(new_pile) 
    return len(piles)
N=int(raw_input())
l=[]
while N>0:
    l.append(int(raw_input()))
    N-=1
print (LIS(l))





# from bisect import bisect
# def lis(seq): 
#     end = [] 
#     for val in seq: 
#         idx = bisect(end, val)             
#         if idx == len(end) or val>end[-1]: end.append(val) 
#         else: end[idx] = val  
#     return len(end) 
# N=int(raw_input())
# l=[]
# while N>0:
#     l.append(int(raw_input()))
#     N-=1
# print(lis(l))

# from functools import wraps
# def memo(func):
#     cache = {} 
#     @wraps(func) 
#     def wrap(*args): 
#         if args not in cache: 
#             cache[args] = func(*args) 
#         return cache[args] 
#     return wrap 
# def lis(seq): 
#     @memo
#     def L(cur): 
#         res = 1 
#         for pre in range(cur): 
#             if seq[pre] <= seq[cur]: 
#                 res = max(res, 1 + L(pre)) 
#         return res
#     return max(L(i) for i in range(len(seq))) 
# N=int(raw_input())
# l=[]
# while N>0:
#     l.append(int(raw_input()))
#     N-=1
# print(lis(l))