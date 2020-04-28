def main():
    from sys import stdin,stdout    
    n = int(stdin.readline())
    b = list(map(int,stdin.readline().split(' ')))
    q = int(stdin.readline())
    Q = list(map(int,stdin.readline().split(' ')))
    s = 0
    for v in Q:
        for i in range(0,n):
            b[i]+=v
            s+=abs(b[i])
        stdout.write(str(s)+'\n')
        s = 0
                
if __name__ == "__main__":
    main()
        