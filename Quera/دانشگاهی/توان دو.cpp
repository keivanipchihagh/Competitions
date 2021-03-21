#include <iostream>
#include <cmath>

using namespace std;

bool DB2(int);

int main()
{
    int Number;
    cin >> Number;
    for (int i=Number;true;i++)
        if (i%2==0 && DB2(i)==true)
        {
            cout << i << endl;
            break;
        }

	return 0;
}

bool DB2(int x)
{
    bool powerOfTwo = !(x == 0) && !(x & (x - 1));
    return powerOfTwo;
}
