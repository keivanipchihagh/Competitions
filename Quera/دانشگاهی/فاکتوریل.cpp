#include <iostream>

using namespace std;

int main()
{
	int Number;
	int Factorial = 1;
	cin >> Number;

	for (int i = 1; i <= Number; i++)
		Factorial *= i;

	cout << Factorial << endl;

	return 0;
}
