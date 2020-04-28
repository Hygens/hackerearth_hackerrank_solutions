#!/usr/bin/python
import numpy as np
from numpy import arange,array
c=70
N=100
x=[c*i for i in arange(N)]
y=[]
for i in range(N):
    y.append((-3*x[i]-8 + 0)/4.0 + (2700 if i%2==1 else 0))    
a = np.corrcoef(array(x),array(y))
arr = a.view()
print(arr[0][1])
print('%.2f'%(arr[0][1]))

