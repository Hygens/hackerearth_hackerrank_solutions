def ninetyNine(cipher):
    N = cipher
    x = 1
    while True: 
        binary = bin(x)[2:]
        nine_ary = str(binary).replace("1", "9")
        dec = int(nine_ary)
        if dec % N == 0:
            return dec
        x += 1
T=int(raw_input())
while T>0:
    cipher = int(raw_input())
    s = "%s"%(ninetyNine(cipher))
    print s
    T-=1