n = int(input().strip())
l = set(int(x) for x in input().split(' '))
started = min(l) ; ended = max(l)
m = ended-started-1
size = len([x for x in l if started<x<ended])
print('YES' if m == size else 'NO')
