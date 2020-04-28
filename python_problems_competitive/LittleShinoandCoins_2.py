def main():
    from sys import stdin,stdout
    from math import factorial as fact
    from collections import Counter
    k = int(stdin.readline().strip())
    s = stdin.readline().strip()
    c = Counter(s)
    stdout.write(str(fact(k)/fact(len(filter(lambda x: x>1,c.values())))))

if __name__ == "__main__":
    main()
