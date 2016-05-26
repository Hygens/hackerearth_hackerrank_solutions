import sys
def indexes(seq, start=0): 
    return (i for i,_ in enumerate(seq, start=start)) 
def gen_all_substrings(s): 
    return (s[i:j] for i in indexes(s) for j in indexes(s[i:], i+1)) 
def get_all_substrings(string): 
    return list(gen_all_substrings(string)) 
t=int(sys.stdin.readline())
while t>0:
    a=sys.stdin.readline().strip()
    l=set(get_all_substrings(a)) ; l=list(l)
    l.sort()    
    k=int(sys.stdin.readline().strip())
    s=''.join(l)
    print(s[k-1])
    t-=1



           

    
    