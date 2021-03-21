#include <iostream>
#include <string>

using namespace std;

int main()
{
	int Num1;	// 5
	int Num2;	// 8
	cin >> Num1 >> Num2;

	cout << Num1 << endl;

	while (Num2 - Num1 > 0)
	{
		int Num3 = Num2 - Num1;
		cout << Num3 << endl;
		Num2 = Num1;
		Num1 = Num3;
	}

	return 0;
}