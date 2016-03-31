#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <unordered_set>

using namespace std;
struct Workshop {
    int startTime;
    int duration;
    int endTime;
};

struct Available_Workshops {
    int n;
    Workshop* workshops = new Workshop[n];
};

Available_Workshops* initialize (int start_time[], int duration[], int n) {
    Available_Workshops* aw = new Available_Workshops();

    aw->n=n;
    int start,dur;
    n=n>100000?100000:n;
    for(int i=0;i<n;i++)
    {
        start=start_time[i]>1000?1000:start_time[i];
        dur=duration[i]>1000?1000:duration[i];
        aw->workshops[i].startTime=start;
        aw->workshops[i].endTime=start+dur;
        aw->workshops[i].duration=dur;
    }

    return aw;
}

bool workshops_sorter(Workshop& lhs, Workshop& rhs) {
    if (lhs.endTime != rhs.endTime)
        return lhs.endTime < rhs.endTime;
    else
        return false;
}

int CalculateMaxWorkshops(Available_Workshops* ptr) {
    int count=0;
    sort(ptr->workshops,ptr->workshops+sizeof ptr->workshops/sizeof ptr->workshops[0],&workshops_sorter);
    for(int i=0;i<ptr->n;i++) {
        for (int j=i+1;j<ptr->n;j++) {
        if((ptr->workshops[i].endTime<ptr->workshops[j].startTime))
        {
                count++; break;
        }
        }
    }
    return count;
}

//int main()
//{
//  int n;
//  cin>>n;
//  int start_time[n],duration[n];
//  for(int i=0;i<n;i++)
//    {
//      cin>>start_time[i];
//    }
//  for(int i=0;i<n;i++)
//    {
//      cin>>duration[i];
//    }

//  Available_Workshops * ptr;
//  ptr=initialize(start_time,duration,n);
//  cout<<CalculateMaxWorkshops(ptr)<<endl;
//  return 0;
//}

