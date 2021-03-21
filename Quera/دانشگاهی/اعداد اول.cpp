#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int Num1,Num2;

    cin >> Num1 >> Num2;

    for (int i=Num1;i<=Num2;i++)
    {
        int Count=0;
        for (int j=1;j<=i;j++)
            if (i%j==0)
            Count++;
        if (Count==2)
            cout << i << endl;
    }


	return 0;
}