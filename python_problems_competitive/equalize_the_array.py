from collections import Counter
n=int(input().strip()) ; print(n-max(Counter(input().split(' ')).values()))