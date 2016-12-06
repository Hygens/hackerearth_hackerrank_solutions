import distance

def hamming1(str1, str2):
        return sum(map(str.__ne__, str1, str2))

n = int(input().strip())
s = input().strip()
m = int(input().strip())
for _ in range(m):
    q = input().split(' ')
    if q[0]=='C': 
        l,r,ch = q[1:]
        s = s.replace(s[int(l)-1:int(r)],ch*(int(r)-int(l)+1))
    elif q[0]=='S':
        l1,r1,l2,r2 = map(int,q[1:])
        a = s[l1-1:r1] ; b = s[l2-1:r2] ; sizea=r1-l1+1; sizeb=r2-l2+1
        s = s[:l1-1]+b+a        
    elif q[0]=='R':
        l,r = map(int,q[1:])
        s = s.replace(s[l-1:r],s[l-1:r][::-1])               
    elif q[0]=='W': 
        l,r = map(int,q[1:])
        print(s[l-1:r])
    elif q[0]=='H':
        l1,l2,z = map(int,q[1:])
        print(distance.hamming(s[l1-1:l1+z-1],s[l2-1:l2+z-1]))
        