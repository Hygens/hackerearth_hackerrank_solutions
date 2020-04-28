def main():
    from sys import stdin,stdout
    n,q = [int(x) for x in stdin.readline().strip().split(' ')]
    a = [int(x) for x in stdin.readline().strip().split(' ')]
    for _ in range(q):
        Q = [int(x) for x in stdin.readline().strip().split(' ')]
        if Q[0]==0: stdout.write('EVEN\n') if int(''.join(map(str,a[Q[1]-1:Q[2]])))%2==0 else stdout.write('ODD\n')
        else: a[Q[1]-1] = ~a[Q[1]-1] & 1

if __name__=='__main__':
    main()