#include <iostream>;
using namespace std;

int main()
{
  // Declare
  int x, y;
  float total;
  char ch;

  // Get inputs
  cout << "Enter value for x: "; cin >> x;
  cout << "Enter value for y: "; cin >> y;
  cout << "Enter value for ch(a/m/s/d/r): "; cin >> ch;

  // Calculation
  if (ch == 'a')
  {
    total = x+y;
  }
  else if (ch == 'm')
  {
    total = x*y;
  }
  else if (ch == 's')
  {
    total = x-y;
  }
  else if (ch == 'd')
  {
    total = x/y;
  }
  else if (ch == 'r')
  {
    total = x%y;
  }
  else
  {
    cout << "Invalid input";
  }

  // Display total
  cout << "Answer: " << total << "\n"; 
}
