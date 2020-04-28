def main():
    from sys import stdin,stdout    
    s = stdin.readline().strip()
    n = int(stdin.readline())
    z = len(s)
    c = s.count('a')
    if z<n:
        if n%z==0: 
            c=c*(n//z)
        else:
            mod = n%z
            c=c*(n//z)+s[:mod].count('a')              
    stdout.write(str(c))           
if __name__ == "__main__":
    main()
        