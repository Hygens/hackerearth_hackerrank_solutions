from sys import stdin,stdout
d = {}
x = stdin.readline().strip()
while x:
    try:
        out = []
        x = x.rstrip('\n')
        for w in x.split(' '):
            _w = w.lower()
            if _w in d:
                out.append('.')
            else:
                d[_w] = 1
                out.append(w)
        stdout.write(' '.join(out)+'\n')
        x = stdin.readline().strip()
    except (EOFError):
        break