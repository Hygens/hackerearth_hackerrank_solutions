import itertools

def is_vowel(ch,t=True):
    if t:
        if "aeiouy".count(ch) >= 1:
            return True
        else:
            return False        
    else:
        if "aeiou".count(ch) >= 1:
            return True
        else:
            return False
    
def isvowel(ch):
    if "aeiou".count(ch) >= 1:
        return True
    else:
        return False
    
def first_vowel(s):
    r = list([i for i,c in enumerate(s) if is_vowel(c,isvowel(s[0]))])
    if len(r)==0:return -1
    else:return r[0] 

s = input().strip()
while s:
    try:
        res = ''
        for x in s.split(' '):
            ix = first_vowel(x) 
            if ix==-1:           
                if ix==0: res+=' '+x+'yay'
                else: res+=' '+x[ix:]+x[:ix]+'ay'
            else:
                res+=x
        print(res.strip())
        s = input().strip()        
    except (EOFError):
        break
        
        
        
        
           
        