#include <iostream>

using namespace std;

bool PrimeORnot(int Number);

int main()
{
    int Number;
    cin >> Number;

    int Sum=0;
    for (int i=Number ; i>0 ; i/=10)
        Sum+=(i%10);

    int k=0;
    for (int i=Number+1 ; true ; i++)
    {
        if (PrimeORnot(i)==true)
            k++;
        if (PrimeORnot(i)==true && k==Sum)
        {
            cout << i << endl;
            break;
        }
    }

    return 0;
}

bool PrimeORnot(int Number)
{
    int Count=0;
    for (int i=1 ; i<=Number ; i++)
        if (Number%i==0)
        Count++;
    if (Count==2)
        return true;
    else
        return false;
}
