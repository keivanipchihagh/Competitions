#include <iostream>
#include <string>
#include <sstream>

using namespace std;

bool PrimeORnot(int Number);

int main()
{
    int Num1,Num2;
    cin >> Num1 >> Num2;

    string str;
    for (int i=Num1+1 ; i<Num2 ; i++)
    {
        if (PrimeORnot(i)==true)
        {
            stringstream ss;
            ss << i;
            str+=ss.str() + ",";
        }
    }

    cout << str.substr(0,str.length()-1);
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
