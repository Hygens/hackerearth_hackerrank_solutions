def main():
    from sys import stdin
    n,m = map(long,stdin.readline().split(' '))
    if (m>n and m%n==0) or m==n: print(0)
    elif m>n and m%n!=0: print(n-m%n)
    elif n>m: print(n-m)
                
if __name__ == "__main__":
    main()
        