s = list(input().strip())

try:
    ix = s.index('<')
    while ix!=-1:
        del s[ix]
        if ix>0: del s[ix-1] 
        ix = s.index('<')
except (ValueError):
    None
    
print(''.join(s))
      
    

    