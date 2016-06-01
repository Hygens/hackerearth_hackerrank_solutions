import sys
s=sys.stdin.readline()
inter1 = s.find('111111')
inter2 = s.find('000000')
if inter1>=0 or inter2>=0:
    print("Sorry, sorry!")
else: 
    print("Good luck!")      
    