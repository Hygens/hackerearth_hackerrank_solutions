max=10**18+1
k=6
nb_factors=[1]*max
for i in range(2,max):
    if nb_factors[i] == 1:
        for j in range(i, max, i):
            nb_factors[j]+=1

print ([(i,f) for i,f in enumerate(nb_factors) if f > k])