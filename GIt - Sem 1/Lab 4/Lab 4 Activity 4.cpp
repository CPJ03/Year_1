#include <iostream>
using namespace std;

int main() 
{
  // Declaration
  int total, a = 1, d = 3;
  
  // Calculation based on formula
  for (int n = 1; n <= 100; n++)
  {
  	total = (a + (n-1)*d);
  	cout << total << endl;
  }
  
  return 0;
}