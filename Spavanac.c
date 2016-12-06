#include <stdio.h>
struct TIME
{
  int minutes;
  int hours;
};

void differenceBetweenTimePeriod(struct TIME start, struct TIME stop, struct TIME *diff)
{
    if(stop.minutes > start.minutes){
        if (start.hours==0) start.hours=23;
        else --start.hours;
        start.minutes += 60;
    }

    diff->minutes = start.minutes - stop.minutes;
    diff->hours = start.hours;
}

//int main()
//{
//    struct TIME startTime, stopTime, diff;
//
//    scanf("%d %d", &startTime.hours, &startTime.minutes);
//
//    stopTime.minutes = 45;
//
//    differenceBetweenTimePeriod(startTime, stopTime, &diff);
//
//    printf("%d %d\n", diff.hours, diff.minutes);
//
//    return 0;
//}


