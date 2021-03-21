#include <iostream>
#include <math.h>
#include <string>
#include <algorithm>

using namespace std;

int main()
{
	int x, y;
	cin >> x >> y;

	if (x != 7 && y != 7)
		cout << "1\n7 7";
	else
		cout << "1\n2 2";
}