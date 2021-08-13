#include <stdio.h>
#pragma warning(disable:4996)
int main(void)
{
	int num1;
	num1 = 1;

	float num2 = 346*12;
	float sum = 0;
	while(num1<21)
	{
		printf("%d년 차는 %f\n", num1, num2);
		num1+=1;
		sum += num2;
		num2 *= 0.98;
		printf("합은%f\n\n", sum);
	}
	return 0;
}