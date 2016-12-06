import decimal
from _pydecimal import ROUND_DOWN
inp = input().strip()
while inp:
    try:
        a,b,c = map(int,inp.split(' ')) 
        decimal.getcontext().prec=c
        decimal.getcontext().rounding=ROUND_DOWN
        s = '{:.{prec}f}'.format(decimal.Decimal(a)/decimal.Decimal(b),prec=c)        
        print(s)
        inp = input().strip()
    except (EOFError):
        break