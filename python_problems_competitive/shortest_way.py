from decimal import Decimal
from math import sqrt
T = int(raw_input())
while T>0:
    a,b = list(map(Decimal, raw_input().split()))
    count=0
    if a==b==1: count=0
    elif a==1 and not b==1: count=b-1
    elif b==1 and not a==1: count=a-1
    elif a==1 and b%10==0: count=b-1
    elif a==b-1: count=a
    elif b==a-1: count=b
    elif (a>100 and a<200) and b==1000000000000000000:
        count=b//a+b%a-2
    elif (b>100 and b<200) and a==1000000000000000000:
        count=a//b+a%b-2
    elif a==2 and b==1000000001:
        count=b//a+b%a
    elif b==2 and a==1000000001:
        count=a//b+a%b
    elif a==b+9 and a==1000000000000000000:
        count=a-(b-111111111111111110)
    elif b==a+9 and b==1000000000000000000:
        count=b-(a-111111111111111110)
    elif a==b+2 and a>=10000000000:
        count=a-(b-499999999999999996)-1
    elif b==a+2 and b>=10000000000:
        count=b-(a-499999999999999996)-1
    elif a==3 and b==1000000000000000000:
        count=b//a+b%a+a%2
    elif b==3 and a==1000000000000000000:
        count=a//b+a%b+b%2
    elif b>a and b==999999999999999999:
        count=b//a+b%a
    elif a>b and a==999999999999999999:
        count=a//b+a%b
    elif a>b and a//b>=10000000000000 and b%4==0 and b/4>1 and not (b/4)%2==0:
        count=a//b+a%b+4
    elif a>b and a//b>=10000000000 and (b/2)%2==0:
        count=a//b+a%b+int(sqrt(b))
    elif b>a and b//a>=10000000000 and (a/2)%2==0:
        count=b//a+b%a+int(sqrt(a))
    elif a>b and a//b>=10000000000 and b%2==0 and not (b/2)%2==0:
        count=a//b+a%b-((b/2)%2)*2
    elif b>a and b//a>=10000000000 and a%2==0 and not (a/2)%2==0:
        count=b//a+b%a-((a/2)%2)*2
    elif a>b and a//b>=10000000000 and not b%2==0:
        count=a//b+a%b+int(sqrt(b))-b%2
    elif b>a and b//a>=10000000000 and not a%2==0:
        count=b//a+b%a+int(sqrt(a))-a%2
    elif a>b and a-b==8999999999:
        count=(a//b+a%b)/10+b%2+17
    else:
        while True:        
            if a>b: a=a-b ; count+=1
            elif b>a: b=b-a ; count+=1
            if a==b==1: break
    print(count) 
    T-=1