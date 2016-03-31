# from bigfloat import * 
from decimal import *

N = int(raw_input())
A = map(int, raw_input().split())
Q = int(raw_input())
O = 1
while(Q > 0):
    O *= int(raw_input())
    Q -= 1
s = ""
for i in [x / O for x in A]:
    s+= str(i)+" "
print(s.strip())
    
