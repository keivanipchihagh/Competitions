#include <iostream>
#include <string>

using namespace std;

int main()
{
	int Num1,Num2,Num3;
	cin >> Num1 >> Num2 >> Num3;

	if (Num1>0 && Num1<180 && Num2>0 && Num2<180 && Num3>0 && Num3<180 && Num1+Num2+Num3==180)
        cout << "Yes";
    else
        cout << "No";

	return 0;
}
