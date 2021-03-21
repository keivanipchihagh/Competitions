#include <iostream>
#include <string>

using namespace std;

int main()
{
	string str;
	cin >> str;

	string Year = str.substr(0, 2);
	string Month = str.substr(2, 2);

	cout << "saal:" << Year << endl;
	cout << "maah:" << Month;

	return 0;
}
