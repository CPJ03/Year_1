#include <iostream>
using namespace std;

int main ()
{
	
	// Declare
	int num;
	float total = 0, sum = 0;
	
	// Get input
	cout << "Enter number of employees: "; cin >> num;
	
	// Declare Struct
	struct data
	{
		int number;
		string name;
		float rate;
		int hours;
	}Arr[num];
	
	for (int i = 0; i < num; i++)
	{
		cout << endl;
		cout << "Employee #" << i+1 << endl;
		cout << "Number: "; cin >> Arr[i].number;
		cin.ignore();
		cout << "Name: "; getline(cin,Arr[i].name);
		cout << "Rate: "; cin >> Arr[i].rate;
		cout << "Hours: "; cin >> Arr[i].hours;
	}

	// Display report
	system("cls"); 
	cout << "________________ Report __________________" << endl;
	for (int j = 0; j < num; j++)
	{
		cout << "Employee #" << j+1 << endl;
		cout << "Number: " << Arr[j].number << endl;
		cout << "Name: " << Arr[j].name << endl;
		total = Arr[j].rate * Arr[j].hours;
		cout << "Gross Pay: RM" << total << endl;
		sum = sum + total;
		cout << endl;
	}
	cout << "Total pay for all employees: " << sum << endl;
	
	return 0;
}