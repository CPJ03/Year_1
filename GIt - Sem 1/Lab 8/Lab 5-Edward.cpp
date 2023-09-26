#include <iostream>
using namespace std;

int main (){
	int arr[5][5];
	
	for (int i = 0; i < 5; i++){
		for (int j = 0; j < 5; j++){
			if (j%2 != 0)
				arr[i][j] = 0;
			else
				arr[i][j] = 1; 
				cout << arr[i][j];
		}
	cout << endl;
	}
	
	return 0;
}