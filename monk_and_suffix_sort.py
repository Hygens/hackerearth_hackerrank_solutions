from sys import stdin,stdout
def suffixes(s):
    for i in range(0,len(s)):
        yield s[i:]
w,k = stdin.readline().split(' '); k = int(k)
w_sorted = sorted(set(suffixes(w)))
stdout.write(w_sorted[k-1]+'\n')
