#include <iostream>
using namespace std;
enum class Fruit { apple, orange, pear };
enum class Color { red, green, orange };

template <typename T> struct Traits {
	  static T name(int index) {
		  T val = (T)index;
		  return val;
	  }
};

std::ostream& operator<<(std::ostream& os, Color c)
{
    switch(c)
    {
        case Color::red   : os << "red";    break;
        case Color::green : os << "green";  break;
        case Color::orange: os << "orange"; break;
        default    : os << "unknown";
    }
    return os;
}

std::ostream& operator<<(std::ostream& os, Fruit f)
{
    switch(f)
    {
        case Fruit::apple  : os << "apple" ; break;
        case Fruit::orange : os << "orange"; break;
        case Fruit::pear   : os << "pear"; break;
        default    : os << "unknown";
    }
    return os;
}

int main()
{
	int t = 0; std::cin >> t;

    for (int i=0; i!=t; ++i) {
        int index1; std::cin >> index1;
        int index2; std::cin >> index2;
        cout << Traits<Color>::name(index1) << " ";
        cout << Traits<Fruit>::name(index2) << "\n";
    }
}
