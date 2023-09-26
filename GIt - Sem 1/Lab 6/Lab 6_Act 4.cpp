#include <iostream>
using namespace std;

// Struture Declare
struct brand
{
	string brand_name;
	int brand_id;
	float exp_2016;
	float exp_2017;
}var[8];

int main ()
{
	// Declaration 
	float change_in_exp, highest_exp = 0, total_exp = 0, avg_exp = 0;
	int n = 8; // Number of products
	string highest_brand, below_avg_brand[8], above_avg_brand[8];
	
	// Get data
	for (int i = 0; i < n; i++)
	{
		cout << "Product #" << i+1 << endl;
		cout << "Brand Name: "; cin >> var[i].brand_name;
		cout << "Brand ID: "; cin >> var[i].brand_id;
		cout << "Expenditure in 2016: "; cin >> var[i].exp_2016;
		cout << "Expenditure in 2017: "; cin >> var[i].exp_2017;
		cout << endl;
	}
	
	cout << "--------------------Analysis----------------------" << endl;
	cout << endl;
	
	// Analysis
	
	// #1 Change in exp
	cout << "________CHANGE IN EXPENDITURE________" << endl;
	cout << endl;
	for (int i = 0; i < n; i++)
	{
		cout << "Product #" << i+1 << endl;
		cout << "Brand Name: " << var[i].brand_name << endl;
		if (var[i].exp_2017 > var[i].exp_2016)
			change_in_exp = (var[i].exp_2017 - var[i].exp_2016);
		else
			change_in_exp = (var[i].exp_2016 - var[i].exp_2017);
		cout << "Change in expenditure: " << change_in_exp << endl;
		
		// Check for analysis #2
		if (change_in_exp > highest_exp)
		{
			highest_exp = change_in_exp;
			highest_brand = var[i].brand_name;
		}
	
		// Check for analysis #3
		total_exp = total_exp + change_in_exp;
		avg_exp = (total_exp/n);
		
		// Check for analysis #4 
		if (change_in_exp < avg_exp)
			below_avg_brand[i] = var[i].brand_name;
			
		// Check for analysis #5
		if (change_in_exp > avg_exp)
			above_avg_brand[i] = var[i].brand_name;
		
		cout << endl;
	}
		cout << endl;
		cout << endl;
	
	// #2 Highest change in exp 
	cout << "________HIGHEST CHANGE IN EXPENDITURE________" << endl;
	cout << endl;
	cout << "Highest change in expenditure: " << highest_brand << "(" << highest_exp << ")" << endl;
	cout << endl;
	cout << endl;
	
	// #3 Average for change in expenditure
	cout << "________AVERAGE CHANGE IN EXPENDITURE________" << endl;
	cout << endl;
	cout << "Average change in expenditure: " << avg_exp;
	cout << endl;
	cout << endl;
	
	// #4 Below average
	cout << "Brands that are below average change in expenditure: " << endl;
	for (int i = 0; i < 8; i++)
	{
		if (below_avg_brand[i] != "null")
			cout << below_avg_brand[i] << endl;
	}
	
	// #5 Above average
	cout << "Brands that are above average change in expenditure: " << endl;
	for (int i = 0; i < 8; i++)
	{
		if (below_avg_brand[i] != "null")
			cout << above_avg_brand[i] << endl;
	}
	
	return 0;
}