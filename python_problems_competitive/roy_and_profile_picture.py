L=int(raw_input())
N=int(raw_input())
while N>0:
    N-=1
    W,H=map(int,raw_input().split())
    if (W>=L and H>=L and W==H): print("ACCEPTED")
    elif (W<L or H<L): print("UPLOAD ANOTHER")
    else: print("CROP IT")
    