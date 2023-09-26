#include <iostream>
using namespace std;

struct Account
	{
		char acc_no[7];
		char acc_type;
		char name[20];
		float balance;
	}var[5];

int main (){
	int n = 1;
	
	// Get info
	for (int i = 0; i < n; i++){
		cout << "Account #" << i+1 << endl;
		cout << "Enter account number: "; cin >> var[i].acc_no;
		cout << "Enter account type: "; cin >> var[i].acc_type;
		cout << "Enter account holder name: "; cin >> var[i].name;
		cout << "Enter account balance: "; cin >> var[i].balance;
	}
	
	// Display
	for (int i = 0; i < n; i++){
		cout << "______________________________________________" << endl;
		cout << "Account #" << i+1 << endl;
		cout << "Account number: " << var[i].acc_no << endl;
		cout << "Account type: " << var[i].acc_type << endl;
		cout << "Account holder name: " << var[i].name << endl;
		cout << "Account balance: " << var[i].balance << endl;
	}
	
	return 0;
}