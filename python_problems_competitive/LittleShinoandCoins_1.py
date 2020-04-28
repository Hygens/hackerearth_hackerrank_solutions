from sys import stdin,stdout
def results(input_string,k,size):
    s=0
    i=0
    cnt = size-k+1
    while i<cnt:
        j=i+k-1
        while j<size:
            if len(set(input_string[i:j+1]))==k: s+=1 
            j+=1
        i+=1
    return s
k = int(stdin.readline().strip())
s = stdin.readline().strip()
size = len(s)
stdout.write(str(results(s, k, size))+'\n')

