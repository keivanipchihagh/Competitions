#include <iostream>
#include <string>

using namespace std;

int main()
{
	int Information;
	std::cin >> Information;

	string str = "";

	for (int i = 0; i < Information; i++)
		str += "o";

	cout << "W" << str << "w!" << endl;

	return 0;
}
