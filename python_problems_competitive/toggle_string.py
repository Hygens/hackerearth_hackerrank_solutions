import sys
from string import lower, upper
def changeLetters(s):
    if s.isupper(): return lower(s)
    else: return upper(s)
letters = list(sys.stdin.readline())
for i,c in enumerate(letters):
    letters[i] = changeLetters(c)
print(''.join(letters))