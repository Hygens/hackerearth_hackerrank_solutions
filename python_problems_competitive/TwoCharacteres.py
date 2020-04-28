#!/bin/python3
def main():
    from itertools import combinations
    from sys import stdin,stdout    
    def ch(n):
        c=0
        for i in range(len(n)-1):
            if n[i]==n[i+1]:
                c=1
                break
        if c==0:
            return True        
    s_len = int(stdin.readline().strip())
    s = stdin.readline().strip()
    l=list(s)
    n=list(set(l))
    if len(n)>=2:
        a=list(combinations(n,2))    
        m=[]    
        for i in a:
            s=''
            for j in l:
                if j in i:
                    s+=j
            m.append(s)        
        z=[]
        for i in m:
            if ch(i)==True:
                z.append(len(i))
        if len(z)>0:
            stdout.write(str(max(z))+'\n')
        else:
            stdout.write('0\n')
    else:
        stdout.write('0\n')
        
if __name__ == "__main__":
    main()         
        
        