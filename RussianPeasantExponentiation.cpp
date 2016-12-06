//#include <iostream>
//#include <iomanip>
//#include <complex>
//#include <cmath>
//using namespace std;
//
//int main()
//{
//    cout << fixed << setprecision(1);
//
//    complex<double> z1 = 1i * 1i;     // imaginary unit squared
//    cout << "i * i = " << z1 << '\n';
//
//    complex<double> z2 = pow(1i, 2); // imaginary unit squared
//    cout << "pow(i, 2) = " << z2 << '\n';
//
//    double PI = acos(-1);
//    std::complex<double> z3 = std::exp(1i * PI); // Euler's formula
//    std::cout << "exp(i * pi) = " << z3 << '\n';
//
//    std::complex<double> z4 = 1. + 2i, z5 = 1. - 2i; // conjugates
//    std::cout << "(1+2i)*(1-2i) = " << z4*z5 << '\n';
//}
#include <complex>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

using namespace std;

//int main( )
//{
//   int q; double a,b,k,m;
//   scanf("%d",&q);
//   while (q-->0) {
//	   scanf("%lf %lf %lf %lf",&a,&b,&k,&m);
//	   complex <double> cb1 (a , b);
//	   complex <double> ce1 = pow ( cb1 ,k );
//	   long long r = (long long)(round(fmod(real(ce1),m)));
//	   long long i = (long long)(round(fmod(imag(ce1),m)));
//	   printf("%lld %lld\n",r,i);
//   }
//}
