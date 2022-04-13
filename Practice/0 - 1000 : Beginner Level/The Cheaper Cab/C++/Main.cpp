#include <iostream>
using namespace std;

int main()
	{
	// your code goes here
	int t;
	std::cin >> t;
	while(t--)
		{
		int A, B;
		std::cin >> A >> B;
		if(A<B)
			{
			std::cout << "FIRST" << std::endl;
			}
		else if(A>B)
			{
			std::cout << "SECOND" << std::endl;
			}
		else
			{
			std::cout << "ANY" << std::endl;
			}
		}
	return 0;
	}
