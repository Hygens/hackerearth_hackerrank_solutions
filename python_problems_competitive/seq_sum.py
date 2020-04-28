T = int(raw_input())
while(T>0):
    x,y = map(int, raw_input().split())
    fn = lambda a: pow(a,y)
    s=sum(map(fn,range(1,x+1)))
    print(s)
    T-=1