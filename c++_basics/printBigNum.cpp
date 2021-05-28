#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
	int num;
	cin >> num;
	
	cout << fixed << setprecision(0) << num * 0.78 << " " << num * 0.956 << endl;
	// std::fixed gets rid of scientific notation
	// setprecision(0) removes decimal point 
	return 0;
}
