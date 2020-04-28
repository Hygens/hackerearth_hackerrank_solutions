new_alphabet = {'a':'@','b':'8','c':'(','d':'|)','e':'3','f':'#','g':'6','h':'[-]','i':'|','j':'_|','k':'|<','l':'1','m':'[]\/[]','n':'[]\[]','o':'0','p':'|D','q':'(,)','r':'|Z','s':'$','t':'\'][\'','u':'|_|','v':'\/','w':'\/\/','x':'}{','y':'`/','z':'2'}
s = input().strip().lower()
res = ''
for c in s:    
    if new_alphabet.__contains__(c): res+=new_alphabet[c]
    else: res+=c
print(res)
        