def main():
    from sys import stdin,stdout
    from itertools import combinations
    
    def hamming(str1, str2):
        return sum(map(str.__ne__, str1, str2))
    
    def min_hamming(arr):
        minh = (float("inf"), None)
        while arr:
            n = arr.pop()
            minh = min([minh] + [(hamming(int2Bin(n), int2Bin(m)), (n, m)) for m in arr]) 
        return hamming(int2Bin(minh[1][0]),int2Bin(minh[1][1]))
    
    def int2Bin(n):
        return '{0:32b}'.format(n)
    
    t = int(stdin.readline().strip())
    while t>0:
        n=int(stdin.readline())
        a=list(map(int,stdin.readline().strip().split(' ')))
        r=min_hamming(a)
        stdout.write(str(r)+'\n')
        t-=1

if __name__ == "__main__":
    main()
    