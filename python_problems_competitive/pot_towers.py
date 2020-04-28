from math import log, exp

def normalize(l):
    """ Adjusts n to put x in the range [0,1) """
    if l[0] >= 1: return normalize((log(l[0]),l[1]+1))
    if l[0] < 0:  return normalize((exp(l[0]),l[1]-1))
    return (l[0],l[1])

normdec = lambda f: lambda *a: normalize(f(*a))

@normdec
def apow(a,l):
    """ Calculates a^(x|n) """
    if a == 1: return (1,0)
    if a < 1: return (rpow(l[0],l[1])*log(a), 1)
    if l[1] == 0: return (l[0]*log(a), 1)
    if l[1] >= 1:
        y, k = cpow(log(log(a)), l[0], l[1]-1)
        return (y, k+2)

@normdec
def cpow(c,x,n):
    """ Calculates (x|n) + c """
    if c == 0: return (x, n)
    if n == 0: return (x + c, 0)
    z = rpow(x,n-1)
    if z <= log(abs(c)):
        return (exp(z)+c, 0)
    if c < 0: y, k = cpow(log(1-exp(log(-c)-z)), x, n-1)
    if c > 0: y, k = cpow(log(1+exp(log(c)-z)), x, n-1)
    return (y, k+1)

def rpow(x,n):
    """ Calculates (x|n) as a float
        Returs Infinty if the value is out of range"""
    try:
        for _ in range(n):
            x = exp(x)
    except OverflowError:
        # We get into this case in two situations
        # 1) We are calculating log((x|n) + c) and c contributes very little
        # 2) We are calculating a^(x|n) for a < 1 and (x|n) is so small it doesn't
        #    fit into a float
        return float('inf')
    return x

def powtow(bs):
    """ Calculates b[0]**b[1]**b[2]**...**b[m-1] in the (x|n) form.
        Equivalent to `foldr apow (1,0) bs'
        e.g. apow(b[0], apow(b[1], apow(b[2], (1,0)))) """
    if not bs: return (1,0)
    return apow(bs[0], powtow(bs[1:]))

if __name__ == '__main__':
    print (powtow([1,2,3,4,5]))
    print (powtow([2,3,4,5]))
    print (powtow([5,4,3,2]))
    print (powtow([4,4,3,3,3]))
    print (powtow([3,3,3,3,3]))
    print (powtow([4,6,8,8,9]))
    print (powtow([2,2,5,2,7,4,9,3,7,6,9,9,9,9,3,2]))
    print (powtow([3,3,6,3,9,4,2,3,2,2,2,2,2,3,3,3]))
    print (powtow([2,3,2,3,5,8]))
    print (powtow([3,2,2,7,6,7]))
    print (powtow([2,2,2,2,2,2,2,2,2,2,2,2,2,2,4,2,2,2]))
    print (powtow([2,2,2,2,2,2,2,2,2,2,2,2,2,2,4,16]))
    print (powtow([9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9]))
    print (powtow([1.54090919967, 1.46228204461, 1.78555495826, 1.75545819035, 2.21730941808, 1.0797564499, 7.90630125423, 0.881978093585, 1.75085618709, 2.23911325176, 1.39697337886, 1.16053659586, 1.5939192079, 6.11401961748, 0.844860266481, 1.92758094038, 4.64573316954, 0.870819420274, 1.49026447511, 1.77839910981, 1.46208378213, 2.29956158055, 1.00884903003, 1.77521724246, 2]))
    print (powtow([2.32185478602, 1.88198918762, 2.27614315145, 1.77518235487, 1.4841479727, 0.563158971798, 0.732132856919, 0.669957968262, 2.16345101714, 2.23185963501, 0.824885385628, 0.873101580546, 1.45714899023, 2.3973000247, 0.507154709525, 1.94022843601, 1.29982267606, 0.578058713016, 1.58207655843, 1.79417433851, 1.18630377782, 1.37314328673, 0.655551609076, 1.57569812897, 1]))
    print (powtow([2, 2, 2, 1]))
    print (powtow([2, 2, 2, 2, .5, 2, 2, 2, 2]))
    
    flip = lambda l: (l[1],l[0])
    snd = lambda a,b: b
    import itertools
    f = lambda xs: [1./x for x in xs]
    # Print all power towers of permutations [2..6], sorted
    print (list(reversed(sorted((flip(powtow(p)),p) for p in itertools.permutations(range(2,7))))))
    # Print all power towers of permutations [1/2..1/6] sorted
    print (list(reversed(sorted((flip(powtow(f(p))),p) for p in itertools.permutations(range(2,7))))))