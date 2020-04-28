def countChange(money,coins):
    if money == 0: 1
    elif (len(coins)==0 or money < 0): 0
    else: countChange(money - coins[0], coins) + countChange(money, coins[1:])
N,M = map(int,raw_input().split())
A=map(int,raw_input().split())
print(countChange(N,A))