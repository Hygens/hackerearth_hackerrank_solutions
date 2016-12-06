#include <stdio.h>

void calc(double num, double caseV[], int index)
{
  if (num == 0)
    {
      return;
    }
  else {
    caseV[index] += 0.5;
    caseV[index] *= 2;
    calc(--num, caseV, index);
  }
}
//int main()
//{
//  int tests;
//  int stops = 0;
//  int index = 0;
//
//  scanf("%d", &tests);
//  double cases[tests];
//  while(tests--)
//    {
//      scanf("%d",&stops);
//      cases[index] = 0;
//      calc(stops, cases, index);
//      index++;
//    }
//  for(int i = 0; i<index; i++)
//    {
//      printf("%d\n", cases[i]);
//    }
//  return 0;
//}


