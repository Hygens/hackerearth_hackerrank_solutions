from sys import stdin,stdout
n,k = [int(x) for x in stdin.readline().split(' ')]
l = [int(x) for x in stdin.readline().split(' ')]
stdout.write(' '.join(map(str,sorted(l,key=lambda x: x%k)))+'\n')

    

