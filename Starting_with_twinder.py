def main():
    from sys import stdin,stdout
    
    m = int(stdin.readline().strip())     
    n = int(stdin.readline().strip()) 
    while n>0:
        h,l = list(map(int, stdin.readline().strip().split(' '))) 
        if h==l and h>=m: stdout.write('ACCEPTED\n')
        elif h>=m and l>=m: stdout.write('CROP IT\n')
        elif h<m or l<m: stdout.write('UPLOAD ANOTHER\n')
        n-=1

if __name__=='__main__':
    main()   