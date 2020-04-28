cards = {"A":[11,11],"K":[4,4],"Q":[3,3],"J":[20,2],"T":[10,10],"9":[14,0],"8":[0,0],"7":[0,0]}
n,s = input().split(' ')
soma = 0
for _ in range(4*int(n)):
    c,b  = list(input())
    if b==s: soma+=cards[c][0]
    else: soma+=cards[c][1]
print(soma)
      
    

    