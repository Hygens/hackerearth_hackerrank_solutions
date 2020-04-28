T = int(raw_input())
while(T>0):
    x,y = map(int, raw_input().split())
    print(pow(x,y,1000000007))
    T-=1
    
