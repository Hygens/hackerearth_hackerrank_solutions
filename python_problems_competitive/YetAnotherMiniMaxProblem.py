#!/usr/bin/python3
def max_xor(iterable):
    array = list(iterable)  # make it a list so that we can iterate it twice
    if not array:  # special case the empty array to avoid an empty max
        return 0
    x = 0
    while True:
        y = max(array)
        if y == 0:
            return x
        # y has the leading 1 in the array
        x = max(x, x ^ y)
        # eliminate
        array = [min(z, z ^ y) for z in array]

n = int(input().strip())
l = list(map(int,input().split(' ')))
print(max_xor(l))