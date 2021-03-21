#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int Count;
    cin >> Count;

    int *arr=new int[Count];

    for (int i=0;i<Count;i++)
        cin >> arr[i];

    int Max=arr[0];
    for (int i=1;i<Count;i++)
        if (arr[i]>Max)
        Max=arr[i];

    cout << Max << endl;

	return 0;
}
