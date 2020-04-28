from sys import stdin,stdout
items = [[int(x)] for x in stdin.readline().split(' ')] ; i = 0
for x in stdin.readline().split(' '): items[i].append(int(x)) ; i+=1
items = sorted(items,key=lambda x: x[0])
print(items)
money = int(stdin.readline().strip())
res = 0
for i in range(3):
    price = items[i][0]
    num = items[i][1]
    n = money // price;
    if n > num:
        n = num    
    res += n
    money = money - (n * price)
stdout.write(str(res)+'\n')