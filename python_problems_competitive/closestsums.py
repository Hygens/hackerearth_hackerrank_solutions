c = 0
while 1:
    try:
        c+=1
        n = int(input().strip())
        l = []
        [l.append(int(input().strip())) for i in range(n)]
        m = int(input().strip())
        q = []
        [q.append(int(input().strip())) for i in range(m)]
        sums = sorted(set([l[i]+l[j] for i in range(n) for j in range(n) if i!=j]))
        print ("Case %s:" %(c))
        for i in q:
            dist = 10**9
            closest = -1
            for j in sums:
                aux = abs(i-j);
                if aux < dist:
                    dist = aux
                    closest = j
                else:
                    break    
            print ("Closest sum to %s is %s." %(i, closest))
    except:
        break

    