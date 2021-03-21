#include <iostream>
#include <string>
using namespace std;

long long Resize(long long Number);

int main()
{
	long long Number;
	std::cin >> Number;

	cout << Resize(Number);

	return 0;
}


long long Resize(long long Number)
{
	long long Digit_Sum = 0;

	while (Number > 0)
	{
		Digit_Sum += Number % 10;
		Number /= 10;
	}
	if (Digit_Sum < 10)
		return Digit_Sum;
	else
		Resize(Digit_Sum);
}
