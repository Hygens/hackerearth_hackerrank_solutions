def main():
    from sys import stdin
    from collections import Counter,OrderedDict
    n = int(stdin.readline().strip()) 
    a = [int(x) for x in stdin.readline().strip().split(' ')]
    d = OrderedDict(Counter(a))
    print(d.items())
    print(d.values())
    q = int(stdin.readline().strip())
    for _ in range(q):
        Q = stdin.readline().strip().split(' ')
                

if __name__=='__main__':
    main()