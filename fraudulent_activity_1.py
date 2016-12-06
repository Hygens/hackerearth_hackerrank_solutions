n, d = map(int, input().split()) 
a = list(map(int, input().split())) 
noti = 0

# histogram for expenditure of the 1st d days
w = [0]*(201) 
for i in range(d): 
    w[a[i]] += 1

# calculate the median: index is the count of days till we get to the position of the median value
# in case of even sample size (d days), we need two values to calculate the median. To make it simpler, 
# I separated the odd and the even case
for i in range(n-d): 
    index, li, lo = 0, 0, 0 
    if d%2 != 0: 
        for j in range(201): 
            index += w[j] 
            if index>=d/2+1: 
                med = float(j)
                break
    else: 
        for j in range(201): 
            index += w[j] 
            if index >= (d/2) and li == 0: 
                li = j 
            if index >= (d/2+1) and lo == 0: 
                lo = j 
            if li != 0 and lo != 0: 
                med = (float(li)+float(lo))/2 
                break 
    
    if float(a[d+i])>=med*2: 
        noti += 1 
                            
    # move the window of d days forward by 1 day
    w[a[i]] -= 1 
    w[a[d+i]] +=1

#we're done
print(noti)