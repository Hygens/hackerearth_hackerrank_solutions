import datetime
t = int(input().strip())
for _ in range(t):
    d1,d2 = input().split(' ')
    day1,m1,y1 = map(int,d1.split(':')) ; day2,m2,y2 = map(int,d2.split(':'))
    dt1 = datetime.date(y1, m1, day1) ; dt2 = datetime.date(y2, m2, day2)
    cnt = 0
    if day1+1==m1 and m1+1==y1%100: cnt+=1
    while (dt1!=dt2):
        dt1 += datetime.timedelta(1)
        day1,m1,y1 = dt1.day,dt1.month,dt1.year
        if day1+1==m1 and m1+1==y1%100: cnt+=1
    print(cnt) 