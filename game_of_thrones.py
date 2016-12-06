from sys import stdin,stdout
T = int(stdin.readline().strip())
result = {0:"SL\n",1:"LB\n",2:"BS\n"}    
while (T):
    D,i=int(stdin.readline().strip()),0    
    while(D>0):    
        i+=1
        D=D-i
    stdout.write(result[i%3])
    T-=1
        
   
    