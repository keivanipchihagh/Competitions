#include <iostream>
#include <math.h>
#include <string>
#include <algorithm>

using namespace std;

int main()
{
	int S1, S2, P1, P2;

	cin >> S1 >> S2 >> P1 >> P2;

	if (S1 >= P1 && S2 >= P2)
		cout << "yes";
	else
		cout << "no";
}