def sum_digits(n):    
    return sum(int(digit) for digit in str(n))
l,d,x = [int(input()) for _ in range(3)]
lst = list(filter(lambda k: sum_digits(k)==x,range(l,d+1)))
print(min(lst))
print(max(lst))

    
    
   
    