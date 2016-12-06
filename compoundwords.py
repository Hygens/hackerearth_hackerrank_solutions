from sys import stdin
from itertools import permutations
words = set()
s = stdin.readline().strip()
while s:
    try:
        ws = set(s.split(' '))
        words = words.union(ws)
        for w in sorted({w1+w2 for w1,w2 in permutations(words, 2)}):
            print(w)
        s = stdin.readline().strip()
    except (EOFError):
        break
    
