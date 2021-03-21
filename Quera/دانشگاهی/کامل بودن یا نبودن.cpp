#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int Number;
    cin >> Number;

    int Sum=0;
    for (int i=1;i<Number;i++)
        if (Number%i==0)
            Sum+=i;

    if (Sum==Number)
        cout << "YES";
    else
        cout << "NO";

	return 0;
}
