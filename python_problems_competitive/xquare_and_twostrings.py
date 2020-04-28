import sys
T=int(sys.stdin.readline())
while T>0:
    s1=sys.stdin.readline().strip()
    s2=sys.stdin.readline().strip()
    if (len(set(s1).intersection(set(s2)))>0): print("Yes")
    else: print("No")
    T-=1