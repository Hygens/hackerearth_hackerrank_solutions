#include <iostream>
using namespace std;
void calc(double n, double* V)
{
  if (n == 0) return;
  else { *V += 0.5; *V *= 2; calc(--n, V); }
}
int main() {
  int tests;
  int stops = 0;
  int index = 0;
  cin >> tests;
  double* result = new double[tests];
  while(tests--)
    {
      cin>>stops;
      *(result+index) = 0;
      calc(stops, result+index);
      index++;
    }
  for(int i = 0; i<index; i++)
    {
      cout << *(result+i) << endl;
    }
  return 0;
}



