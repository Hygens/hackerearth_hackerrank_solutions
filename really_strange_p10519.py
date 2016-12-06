t=input().strip()
while t:
    try:
        N=int(t)
        print((N*N)-(N-2))
        t=input().strip()
    except (EOFError):
        break
    