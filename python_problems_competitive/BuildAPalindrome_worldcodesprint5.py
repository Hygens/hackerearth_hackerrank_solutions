import sys
from itertools import takewhile
def part(s1, s2):
    return sum(takewhile(bool, (a==b or a+b==(a+b)[:-1] for a, b in zip(s1, s2) if len(a+b)>2))) 

def palindromes(s):
    for i in range(1, 2*len(s)):
        m = i//2; n = i - m
        common = part(s[n-1::-1], s[m:])
        p = s[n-common:m+common]
        if p: yield p

q = int(sys.stdin.readline().strip())
while q>0:
    a = sys.stdin.readline().strip()
    b = sys.stdin.readline().strip()
    c = a+b
    d = len(set(c))
    if d<len(c):
        palindrome = max(palindromes(c), key=len)
        if len(palindrome)>0: print(palindrome)
        else: print(-1)
    else: print(-1)
    q-=1