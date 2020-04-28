while True: 
    x=int(input())
    if x==-1: break 
    print(x if x%2==0 else '',end='' if x%2!=0 else '\n') 