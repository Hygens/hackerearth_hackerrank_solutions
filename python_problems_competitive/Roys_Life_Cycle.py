from sys import stdin
import re
def cnt_vals(l): 
    L = map(len,re.findall('([C]+)',l))
    if sum(L)==0: return 0  
    else: return max(L)
n=int(stdin.readline().strip())
nstreak = ''
bst = 0
for _ in range(n):
    s=stdin.readline().strip()
    nstreak+=s
    c = cnt_vals(s)
    if c>bst: bst=c
print('%d %d' %(bst,cnt_vals(nstreak)))