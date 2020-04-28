from difflib import ndiff
q = int(input().strip()) 
while q>0:
    a = input().strip().upper() ; b = input().strip().upper()
    r = ''.join([x.strip() for x in filter(lambda x: x=='  '+x.strip(),list(ndiff(a,b)))])
    print("YES" if r==b else "NO")
    q-=1
