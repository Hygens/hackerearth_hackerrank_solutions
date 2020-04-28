def is_sorted(l):
    res=''
    if all(l[i] <= l[i+1] for i in range(len(l)-1)):
        res='INCREASING'
    elif all(l[i] >= l[i+1] for i in range(len(l)-1)):
        res='DECREASING'
    else:
        res='NEITHER'
    return res
n = int(input()) 
l = [input() for _ in range(n)]
print(is_sorted(l))
    
    
   
    