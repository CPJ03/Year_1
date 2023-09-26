#include <iostream>

using namespace std;

int main()
{
  // Declare
  string name; 
  int hours, hours_1, hours_2;
  float pay; 

  // Get user name and working hours
  cout << "Name: "; cin >> name;
  cout << "Working hours: "; cin >> hours;

  // Calculate pay slip
  if (hours <= 40)
  {
    pay = hours*5;
  }
  else if (hours <= 60)
  {
    hours_1 = hours - 40;
    pay = (40*5) + (hours_1*8);
  } 
  else
  {
    hours_2 = hours - 60; 
    pay = (40*5) + (20*8) + (hours_2*10);
  }

  // Subtract SOCSO
  pay = 0.99*pay;

  // Display final pay slip
  cout << "Final pay slip: " << pay; 
  
  return 0;
}

