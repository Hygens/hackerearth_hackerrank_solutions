def main():
    from sys import stdin,stdout
    from functools import reduce
    n,m = map(int,stdin.readline().strip().split(' '))
    c = sorted(map(int,stdin.readline().split(' ')))
    stdout.write(str(reduce(max, map(lambda x: (x[1]-x[0])/2, zip(c, c[1:])), max(c[0], n-1-c[-1]))))

if __name__ == "__main__":
    main()

    



