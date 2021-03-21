#include <iostream>
#include <string>

using namespace std;

int main()
{
	// First Person:
	int First_Person;
	cin >> First_Person;

	string *arr1 = new string[First_Person];
	for (int i = 0; i < First_Person; i++)
		cin >> arr1[i];

	// Second Person:
	int Second_Person;
	cin >> Second_Person;

	string *arr2 = new string[Second_Person];
	for (int i = 0; i < Second_Person; i++)
		cin >> arr2[i];

	// Third Person:
	int Third_Person;
	cin >> Third_Person;

	string *arr3 = new string[Third_Person];
	for (int i = 0; i < Third_Person; i++)
		cin >> arr3[i];

	// Calculations:
	bool Avalibility[7]{ true,true, true, true, true, true, true };

	for (int i = 0; i < First_Person; i++)
	{
		if (arr1[i] == "shanbe")
			Avalibility[0] = false;
		if (arr1[i] == "1shanbe")
			Avalibility[1] = false;
		if (arr1[i] == "2shanbe")
			Avalibility[2] = false;
		if (arr1[i] == "3shanbe")
			Avalibility[3] = false;
		if (arr1[i] == "4shanbe")
			Avalibility[4] = false;
		if (arr1[i] == "5shanbe")
			Avalibility[5] = false;
		if (arr1[i] == "jome")
			Avalibility[6] = false;
	}

	for (int i = 0; i < Second_Person; i++)
	{
		if (arr2[i] == "shanbe")
			Avalibility[0] = false;
		if (arr2[i] == "1shanbe")
			Avalibility[1] = false;
		if (arr2[i] == "2shanbe")
			Avalibility[2] = false;
		if (arr2[i] == "3shanbe")
			Avalibility[3] = false;
		if (arr2[i] == "4shanbe")
			Avalibility[4] = false;
		if (arr2[i] == "5shanbe")
			Avalibility[5] = false;
		if (arr2[i] == "jome")
			Avalibility[6] = false;
	}

	for (int i = 0; i < Third_Person; i++)
	{
		if (arr3[i] == "shanbe")
			Avalibility[0] = false;
		if (arr3[i] == "1shanbe")
			Avalibility[1] = false;
		if (arr3[i] == "2shanbe")
			Avalibility[2] = false;
		if (arr3[i] == "3shanbe")
			Avalibility[3] = false;
		if (arr3[i] == "4shanbe")
			Avalibility[4] = false;
		if (arr3[i] == "5shanbe")
			Avalibility[5] = false;
		if (arr3[i] == "jome")
			Avalibility[6] = false;
	}

	int Result = 0;
	for (int i = 0; i < 7; i++)
	{
		if (Avalibility[i] == true)
			Result++;
	}

	cout << Result << endl;

	return 0;
}
