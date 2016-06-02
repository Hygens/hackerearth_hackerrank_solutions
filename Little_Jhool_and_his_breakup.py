import sys
s=sys.stdin.readline().strip()
l = s.find('l')
o = s.find('o',l)
v = s.find('v',o)
e = s.find('e',v)
if l<o<v<e: print('I love you, too!')
else: print('Let us breakup!')

    