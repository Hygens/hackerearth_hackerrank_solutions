#!/bin/python
import sys
N = int(sys.stdin.readline().strip())
if (N%2!=0) or (N%2==0 and N in range(6,21)): print('Weird')
elif (N%2==0 and N in range(2,6)) or (N%2==0 and N>20): print('Not Weird')