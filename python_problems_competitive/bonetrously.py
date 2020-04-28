def main():
    from operator import add    
    def max_sum(n,k):
        if n == 1:
            return 1
        return n*k - (k-1)*k/2
        
    def bin_search(n,k,b):
        l = 1
        r = k
        while l < r:
            m = l + (r-l)/2
            if max_sum(m,b) < n:
                l = m+1
            else:
                r = m
        return l
    
    t = int(input())
    for _t in range(t):
        n,k,b = map(int, input().strip().split(' '))
        # binary search for maxsum
        m = bin_search(n,k,b)
        cursum=max_sum(m,b)
    
        if cursum < n:
            print -1,
        else:
            start=m-b+1
            l,r,inc=0,b-1,0
            if n-cursum > 0:
                inc = 1
                l = b-n+cursum
                r = b-1
            elif cursum-n > 0:
                inc = -1
                l = 0
                r = cursum-n
            if (inc == -1 and start <= 1) or start < 1:
                print (-1),
            else:
                for i in range(b):
                    if i >= l and i < r:
                        print (start+inc+i),
                    else:
                        print (start+i),
        print
        
if __name__=='__main__':
    main()