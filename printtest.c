#include <stdio.h>

int main()
{
	printf("password:");
	int num1;
	scanf_s("%d", &num1);
	printf("one more:");
	int num2;
	scanf_s("%d", &num2);
	
	if (num1 == num2)
		printf("correct!");
	else
		printf("fail, idiot");

	return 0;
}