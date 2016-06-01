import sys
import itertools
def hamming1(str1, str2):
    return sum(itertools.imap(str.__ne__, str1, str2))
t = int(sys.stdin.readline().strip())
while t>0:
    n=int(sys.stdin.readline().strip())
    a=sys.stdin.readline().strip().split(' ')
    r=sorted(map(lambda (x,y): int(x)^int(y),itertools.combinations(a,2)))
    r=min(map(lambda (x,y): hamming1(str(x),str(y)),itertools.combinations(r,2)))
    print(r)
    t-=1
    