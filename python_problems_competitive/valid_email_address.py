import email.utils,re
l=[]
for _ in range(int(raw_input())):
    a=email.utils.parseaddr(raw_input().strip())
    if a[1]:
        b=a[1].split('@')
        if len(b)>1:
            c=b[1].split('.')
            if re.search(r'^[a-zA-Z][0-9a-zA-Z-_\.]*$',b[0]) and all(re.search(r'^[a-zA-Z]+',e) for e in c) and len(c[-1])<4:
                l.append(email.utils.formataddr(a))
l.sort()
print l