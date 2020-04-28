from decimal import Decimal
from math import sqrt
N = Decimal(raw_input())
if sqrt(N).is_integer(): print('YES')
else: print('NO')