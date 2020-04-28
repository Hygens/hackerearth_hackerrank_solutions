import sys
M=1000000007
d=[1]
for i in range(3,1000001):
    n = ((i*i-i)/2)-1+i    
    d.append(n%M)
    print(i,d[-1])
orig_stdout = sys.stdout
f = open('genfiles/out.txt', 'w')
sys.stdout = f
print(d)
sys.stdout = orig_stdout
f.close()
