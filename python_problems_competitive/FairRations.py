import sys
n = int(sys.stdin.readline().strip())
arr = map(int,sys.stdin.readline().strip().split(" "))
loaf = 0
even = len(filter(lambda x: x%2==0,arr))
odd = n-even
if n%2==0 and (odd==even or odd == n-1 or even==n-1): print('NO')
elif odd%2!=0 and even%2!=0: print('NO')
elif even%2==0 and odd%2!=0: print('NO')
else:
    for i in range(n): 
        if arr[i]%2!=0:
            loaf += 2
            arr[i]+=1
            if i+1<n:
                arr[i+1]+=1 
    res = filter(lambda x: x%2==0,arr)
    if len(arr)==len(res): print loaf
    else: print('NO')
         
