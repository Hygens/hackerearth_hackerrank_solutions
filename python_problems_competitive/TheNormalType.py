from sympy.utilities.iterables import subsets
def main():
    from sys import stdin
    
    def subarrays_count(iterable,n,k):
        acum=set()
        for size in range(2, n+1):
            for index in range(n+1-size):
                sub = set(iterable[index:index+size])
                if len(sub)==k:
                    acum.add(sub)
        return len(acum)
    
    n=int(stdin.readline().strip())
    S=stdin.readline().split(' ')
    k = len(set(S))       
    print(subarrays_count(S,n,k)+k)
                
if __name__ == "__main__":
    main()
        
    