#include <stdio.h>

int main(void)
	{
	// your code goes here
	int t;
	scanf("%d",&t);
	while(t--)
		{
		int X,Y;
		scanf("%d%d",&X,&Y);
		int ans = X - Y;
		if(ans>=0)
			{
			printf("%d\n",ans);
			}
		else
			{
			printf("%d\n",-1*ans);
			}
		}
	return 0;
	}
