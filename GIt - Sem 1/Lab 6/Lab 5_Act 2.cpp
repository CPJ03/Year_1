#include <iostream>
using namespace std;

struct Account
{
	int number;
	char name[30];
	float rate;
	int hours;
}Array[6];

int main ()
{
	for (int i = 0; i < 6; i++)
	{
		cout << "Employee #" << i+1 << endl;
		cout << "Number: "; cin >> Array[i].number; 
		cout << "Name: "; 	cin >> Array[i].name;
		cout << "Rate: "; 	cin >> Array[i].rate;
		cout << "Hours: "; 	cin >> Array[i].hours;
		cout << endl;
	}
	
	cout << "_________________________________________" << endl;
	cout << endl;
	
	float total = 0;
	
	for (int i = 0; i < 6; i++)
	{
		float gross_pay = Array[i].rate*Array[i].hours;
		cout << "Employee #" 	<< i+1 << endl;
		cout << "Name: " 		<< Array[i].name << endl;
		cout << "Gross Pay: " 	<< gross_pay << endl;
		cout << endl;
		total = total + gross_pay;
	}
	
	cout << "Total gross pay: " << total;
}
