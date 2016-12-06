a,b = map(int,input().strip().split(' ')); 
if b==1 or a%2!=0: print(0)
else: print(a*(a-1)//2 % a)