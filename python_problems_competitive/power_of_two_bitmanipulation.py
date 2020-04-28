def main():
    from math import log
    from sys import stdin,stdout
    from itertools import combinations 
    from functools import reduce
    
    T = int(stdin.readline().strip())
    while(T>0):
        N=int(stdin.readline().strip())
        L = set(map(int, stdin.readline().strip().split(' ')))
        if N==1: print("NO")
        else:
            sim = False
            for i in range(1,N+1):
                for a in combinations(L,i):                              
                    r = reduce(lambda x,y: x&y,a)
                    if r>0 and log(r,2).is_integer(): 
                        sim=True
                        break
                if sim: break
            if sim: stdout.write("YES\n")
            else: stdout.write("NO\n")
        T-=1
        
if __name__ == "__main__":
    main()