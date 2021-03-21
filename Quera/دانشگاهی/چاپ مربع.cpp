#include <iostream>
#include <cmath>

using namespace std;

bool DB2(int);

int main()
{
    int Number;
    cin >> Number;

    for (int i=0 ; i<Number ; i++)
    {
        for (int j=0 ; j<Number ; j++)
        {
            if (i==0 || i==Number-1)
                cout << "*";
            else
            {
                if (j==0 || j==Number-1)
                    cout << "*";
                else
                    cout << " ";
            }
        }
        cout << endl;
    }

    return 0;
}
