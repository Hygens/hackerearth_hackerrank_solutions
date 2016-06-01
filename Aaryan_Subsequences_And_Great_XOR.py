import sys
n=int(sys.stdin.readline().strip())
a=sys.stdin.readline().strip().split(' ')
print(reduce(lambda x,y: int(x)|int(y),a))
    