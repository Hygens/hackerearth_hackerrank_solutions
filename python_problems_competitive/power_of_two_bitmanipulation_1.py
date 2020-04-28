def main():
    from math import log
    from sys import stdin,stdout
    from itertools import tee 
    from functools import reduce
    def pairwise(iterable):    
        a, b = tee(iterable)
        next(b, None)
        return zip(a, b)   
    T = int(stdin.readline().strip())
    d = dict()
    while(T>0):
        N=int(stdin.readline().strip())
        L = set(map(int, stdin.readline().strip().split(' ')))
        if N==1: print("NO")
        else:
            sim = False
            key = ''
            for i in range(1,N+1):
                for a in pairwise(L):
                    key = ''.join(map(str,a))
                    if not d.__contains__(key):                              
                        r = reduce(lambda x,y: x&y,a)
                        if r>0 and log(r,2).is_integer(): 
                            sim = True                                                   
                            d[key]="YES"
                            break
                        else: d[key]="NO"
                    else: break                    
                if sim: break                
            stdout.write(d[key]+'\n')            
        T-=1
        
if __name__ == "__main__":
    main()