#include <iostream>
using namespace std;

int main()
	{
	// your code goes here
	int t;
	std::cin >> t;
	while(t--)
		{
		int X, Y;
		std::cin >> X >> Y;
	    	int ans = Y * 30;
	    	if(X>=ans)
			{
			std::cout << "YES" << std::endl;
			}
	    	else
			{
			std::cout << "NO" << std::endl;
			}
    		}
	return 0;
	}
