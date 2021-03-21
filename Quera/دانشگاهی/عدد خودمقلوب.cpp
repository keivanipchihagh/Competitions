#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int Number;
    int Reverse=0;
    cin >> Number;

    for (int i=Number;i>0;i/=10)
    {
        int Temp=i%10;
        Reverse=Reverse*10+Temp;
    }

    if (Reverse==Number)
        cout << "YES";
    else
        cout << "NO";

	return 0;
}
