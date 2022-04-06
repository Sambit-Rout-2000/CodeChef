#include <iostream>
using namespace std;

int main() 
	{
	// your code goes here
	int t;
	std::cin >> t;
	while(t--)
        	{
        	int X,Y;
        	std::cin >> X >> Y;
        	int ans = X - Y;
        	if(ans>=0)
			{
			std::cout << ans << std::endl;
			}
		else
			{
			std::cout << -1*ans << std::endl;
			}
		}
	return 0;
	}
