#include <iostream>
using namespace std;

int main()
{
	// Get input: No of stocks
	int num;
	cout << "Enter number of stocks: "; cin >> num;
	cout << endl;
	
	// Declare Struct
	struct dataset
	{
		string name;
		float eps; // earning per share
		float per; // price-to-earning ratio
	}Arr[num];
	
	// Get input
	system("cls");
	for (int i = 0; i < num; i ++)
	{
		cout << "Stock #" << i+1 << endl;
		cout << "Enter stock's name: "; cin.ignore(); getline (cin, Arr[i].name);
		cout << "Enter stock's earning per share: "; cin >> Arr[i].eps;
		cout << "Enter stock's price-to-earning ratio: "; cin >> Arr[i].per;
		cout << endl;
	}
	
	// Display
	system("cls");
	cout << "_______________ Result _______________" << endl;
	for (int j = 0; j < num; j++)
	{
		cout << "Stock: " << Arr[j].name << endl;
		cout << "Anticipated price: " << Arr[j].eps * Arr[j].per << endl;
		cout << endl;
	}
	
	
	return 0;
}