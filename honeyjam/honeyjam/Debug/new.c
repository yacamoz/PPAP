#include <stdio.h>

int jegob(int a, int b);
int main()
{
	int num2 = 1;
	for (int i = 0; i < 7; i++)
	{
		num2 = (-7 * (jegob(5, i) / 7)) + jegob(5, i);
		printf("%d ", num2);
	}

}

int jegob(int a, int b)
{
	int sum = 0;
	for (int i = b; i < b; i++)
	{
		sum = (a * a);
	}
	return sum;
}