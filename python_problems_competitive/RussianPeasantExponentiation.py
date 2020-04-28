def main():
    from sys import stdin
    from math import hypot,atan2,cos,sin,fmod,pi
    q=int(stdin.readline())
    while q>0:
        a,b,k,m = map(int,stdin.readline().strip().split(' '))
        z = round(hypot(a,b))
        arc = round(atan2(b,a),2)
        zp = round(pow(z,k,m),2)
        arcx = round(fmod(arc*k,pi),2)
        r = round(zp*cos(arcx))
        i = round(zp*sin(arcx))
        print("%.f %.f" %((r % m),(i % m)))
        q-=1

if __name__=='__main__':
    main()
