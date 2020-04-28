def main():
    from sys import stdin,stdout
    from collections import Counter
    n = int(stdin.readline())
    c = list(stdin.readline().split(' '))
    d = Counter(c)
    s = 0
    for v in d.values():
        if v>1:
            if v%2==0: s+=v/2
            else: s+=(v-1)/2
    stdout.write(str(s))        
                
if __name__ == "__main__":
    main()
        