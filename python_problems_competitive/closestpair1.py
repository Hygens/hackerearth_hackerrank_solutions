from operator import itemgetter, attrgetter 
infinity = float('inf')
def bruteForceClosestPair(point):
    numPoints = len(point)
    if numPoints < 2:
        return infinity, (None, None)
    return min( ((abs(point[i] - point[j]), (point[i], point[j]))
                 for i in range(numPoints-1)
                 for j in range(i+1,numPoints)),
                key=itemgetter(0))
def closestPair(point):
    xP = sorted(point, key=lambda x: x.real)
    yP = sorted(point, key=lambda x: x.imag)
    return _closestPair(xP, yP) 
def _closestPair(xP, yP):
    numPoints = len(xP)
    if numPoints <= 3:
        return bruteForceClosestPair(xP)
    Pl = xP[:numPoints/2]
    Pr = xP[numPoints/2:]
    Yl, Yr = [], []
    xDivider = Pl[-1].real
    for p in yP:
        if p.real <= xDivider:
            Yl.append(p)
        else:
            Yr.append(p)
    dl, pairl = _closestPair(Pl, Yl)
    dr, pairr = _closestPair(Pr, Yr)
    dm, pairm = (dl, pairl) if dl < dr else (dr, pairr)    
    closeY = [p for p in yP  if abs(p.real - xDivider) < dm]
    numCloseY = len(closeY)
    if numCloseY > 1:        
        closestY = min( ((abs(closeY[i] - closeY[j]), (closeY[i], closeY[j]))
                         for i in range(numCloseY-1)
                         for j in range(i+1,min(i+8, numCloseY))),
                        key=itemgetter(0))
        return (dm, pairm) if dm <= closestY[0] else closestY
    else:
        return dm, pairm

n = int(input().strip())
while n!=0:
    try:
        pointList = []
        for _ in range(n):
            c = complex(*map(float,input().strip().split(' ')))
            pointList.append(c)
        pairs = closestPair(pointList)[1]
        print('%.2f %.2f %.2f %.2f' %(pairs[0].real, \
                                      pairs[0].imag, \
                                      pairs[1].real, \
                                      pairs[1].imag))
        n = int(input().strip())
    except (TypeError):
        continue
    except (EOFError):
        break
