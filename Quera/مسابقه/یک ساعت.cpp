#include <iostream>
#include <math.h>
#include <string>
#include <algorithm>

using namespace std;

int main()
{
	int hour, min;
	cin >> hour >> min;

	if (hour == 0 && min != 0) {
		min = 60 - min;
		printf("%.2d:%.2d", hour, min);
	}
	else if (hour != 0 && min == 0) {
		hour = 12 - hour;
		printf("%.2d:%.2d", hour, min);
	}
	else if (hour == 0 && min == 0) {
		printf("%.2d:%.2d", hour, min);
	} else {
		hour = 12 - hour;
		min = 60 - min;
		printf("%.2d:%.2d", hour, min);
	}
}