#include <iostream>
using namespace std;

int main() 
{
  // Declare
  int total;
  total = 0;
  
  
  // Divisible by 7 and add into total
  for (int i = 1567; i <= 9876; i ++)
    {
      if (i%7 == 0)
        total = total + i; 
    }

  // Display total
  cout << total << "\n"; 
}