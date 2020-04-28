from sys import stdin,stdout
b, k, g = map(int, stdin.readline().strip().split(' '))
if b%2==0: stdout.write(str((b)//(k//g)))
else: stdout.write(str((b-1)//(k//g)))