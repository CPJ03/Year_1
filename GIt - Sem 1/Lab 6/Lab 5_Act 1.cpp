#include <iostream>
using namespace std;

struct Account
{
	char acc_no[7];
	char acc_type;
	char name[20];
	float balance;
}Array[5];

int main ()
{
	for (int i = 0; i < 1; i++)
	{
		cout << "Account #" << i+1 << endl;
		cout << "Account Number: "; cin >> Array[i].acc_no;
		cout << "Account Type: "; cin >> Array[i].acc_type;
		cout << "Name: "; cin >> Array[i].name;
		cout << "Account Balance: "; cin >> Array[i].balance;
		cout << endl;
	}
	
	cout << "_________________________________________" << endl;
	cout << endl;
	
	for (int i = 0; i < ; i++)
	{
		cout << "Account #" << i+1 << endl;
		cout << "Account Number: " << Array[i].acc_no << endl;
		cout << "Account Type: " << Array[i].acc_type << endl;
		cout << "Name: " << Array[i].name << endl;
		cout << "Account Balance: " << Array[i].balance << endl;
		cout << endl;
	}
}
