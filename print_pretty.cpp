#include <iostream>
#include <iomanip>
using namespace std;
int main() {
	int T; cin >> T;
	cout << setiosflags(ios::uppercase);
	cout << setw(0xf) << internal;
	while(T--) {
		double A; cin >> A;
		double B; cin >> B;
		double C; cin >> C;
		cout.unsetf ( ios::uppercase );
		std::ios oldState(nullptr);
		oldState.copyfmt(std::cout);
		cout << left << setw(15) << showbase << hex << long(A) << '\n';
		cout.copyfmt(oldState);
		if (B>0)
			cout << setw(15) << setfill('_') << right << setprecision(2) << fixed << showpos << B << '\n';
		else
			cout << setw(15) << setfill('_') << right << setprecision(2) << fixed << B << '\n';
		cout.copyfmt(oldState);
		cout << scientific << uppercase << setprecision(9) << C << '\n';
	}
	return 0;
}
