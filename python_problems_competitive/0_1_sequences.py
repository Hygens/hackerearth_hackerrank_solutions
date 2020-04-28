def hamming1(str1, str2):
        return sum(map(str.__ne__, str1, str2))
    
l = input().strip()
k = l.count('?')
l1 = l.replace('?','1')
s1 = sorted(l1)
l2 = l.replace('?','0')
s2 = sorted(l2)
print(hamming1(l1,s1)%1000000007)
print((2**k-1)%1000000007)

      
    

    