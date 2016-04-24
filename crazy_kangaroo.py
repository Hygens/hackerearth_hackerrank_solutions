n=input()
while n>0:
    n-=1
    a=map(int,raw_input().split())
    z=a[1]-a[0]+1
    count=z/a[2]
    y=z%a[2]
    x=a[1]%a[2]
    if x<y:
        count+=1
    print (count)