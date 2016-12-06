def findnext(ii):
    iis=list(map(int,str(ii)))
    for i in reversed(list(range(len(iis)))):
        if i == 0: return ii
        if iis[i] > iis[i-1] :
            break        
    left,right=iis[:i],iis[i:]
    for k in reversed(range(len(right))):
        if right[k]>left[-1]:
            right[k],left[-1]=left[-1],right[k]
            break
    return int("".join(map(str,(left+sorted(right)))))

n = int(input().strip())
r = findnext(n)
print(r) if r!=n else print(0)

