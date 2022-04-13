#include <stdio.h>

int main(void)
	{
	// your code goes here
	int t;
	scanf("%d",&t);
	while(t--)
		{
		int A, B;
		scanf("%d%d",&A,&B);
		if(A<B)
			{
			printf("FIRST\n");
			}
		else if(A>B)
			{
			printf("SECOND\n");
			}
		else
			{
			printf("ANY\n");
			}
        	}
	return 0;
	}
