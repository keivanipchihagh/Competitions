#include <iostream>

using namespace std;

int main()
{
	int Num1;
	int Num2;
	int Num3;

	cin >> Num1 >> Num2 >> Num3;

	int S_Num1=Num1*Num1;
	int S_Num2=Num2*Num2;
	int S_Num3=Num3*Num3;

	if (S_Num1==S_Num2+S_Num3 || S_Num2==S_Num1+S_Num3 || S_Num3==S_Num1+S_Num2)
        cout << "YES" << endl;
    else
        cout << "NO" << endl;


	return 0;
}
