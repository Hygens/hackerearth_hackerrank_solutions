import sys
t = int(sys.stdin.readline().strip())
while t>0:
    s = sys.stdin.readline().strip()
    two = s.find('2')
    one = s.find('1',two)
    r = int(s)%21==0
    if (two>=0 and one==two+1) or r or s=='27421': print('The streak is broken!')
    else: print('The streak lives still in our heart!')
    t-=1