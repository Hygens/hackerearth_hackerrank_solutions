letters = {' ':'0','abc':'2','def':'3','ghi':'4','jkl':'5','mno':'6','pqrs':'7','tuv':'8','wxyz':'9'}
n = int(input().strip())
for x in range(1,n+1):
    s = input()
    res = ''
    ant = ''    
    for c in s:
        for k in letters.keys():
            ix = k.find(c)
            if ix>=0:
                if res and k==ant: res+=' '+letters[k]*(ix+1); ant = k
                else: res+=letters[k]*(ix+1) ; ant = k
    print('Case #%i: %s' %(x,res)) 
    

    