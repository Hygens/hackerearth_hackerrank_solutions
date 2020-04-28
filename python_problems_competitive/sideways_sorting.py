vals = input().strip()
while vals!='0 0':
    try:
        n,m = map(int,vals.split(' '))
        for _ in range(n):
            print(''.join(list(sorted(input().strip(),key=str.lower))))
        print('')
        vals = input().strip()
    except (EOFError):
        break
    

    