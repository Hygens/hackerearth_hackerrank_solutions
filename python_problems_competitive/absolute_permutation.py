def main():    
    from sys import stdin, stdout
    
    for _ in range(int(input())):
        n, k = map(int, stdin.readline().split(" "))
        l = list(range(1, n+1))
        if k == 0:
            stdout.write(" ".join(map(str, l))+'\n')
        elif (n % 2) or ((not n % 2) and (n % k)):
            stdout.write(str(-1)+'\n')
        else:
            for i in range(0, len(l)-k, k*2):
                l[i:i+k],l[i+k:i+2*k] = l[i+k:i+2*k], l[i:i+k]
            stdout.write(" ".join(map(str, l))+'\n')

if __name__ == "__main__":
    main()
        