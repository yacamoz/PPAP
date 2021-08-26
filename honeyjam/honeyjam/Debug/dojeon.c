#include <stdio.h>
#pragma warning(disable:4996)

/*int main()
{
	int num = 0;
	scanf("%d", &num);
	printf("%x", num);
	return 0;
}*/
/*t gugudan(int num1, int num2)
{
	int i = 1;
	while (num1 <= num2)
	{
		i = 1;
		while (i++ < 9)
		{
			printf("%dx%d = %d\n", num1, i, num1 * i);
		}
		num1++;
	}
}
int main()
{
	int num1 = 1, num2 = 1;
	scanf("%d %d", &num1, &num2);

	if (num1 < num2)
		gugudan(num1, num2);
	else if (num1 > num2)
		gugudan(num2, num1);

	return 0;
}*/
/*int gcd(int num1, int num2)
{
	int b = 0;
	for (int a = 1; num1 >= a && num2 >= a; a++)
	{
		if (num1 % a == 0 && num2 % a == 0)
			b = a;
	}
	return b;
}
int main(void)
{
	int num1, num2;
	int result = 0;
	printf("두 개의 정수 입력 \n");
	scanf_s("%d %d ", &num1, &num2);
	if (num1 >= num2)
		result = gcd(num1, num2);
	else if (num1 < num2)
		result = gcd(num2, num1);
	printf("최대 공약수 : %d \n", result);
	return 0;
}*/
/*int main()
{
	for (int i = 2; i < 50; i++)
	{
	
		for (int a = 2; a < i ; a++)
		{
			if (i % a == 0)
				break;
		}
		printf("%d", i);
	}
	return 0;
}*/
/*int main()
{
	int num1 = 0, hour = 0, min = 0, sec = 0;
	scanf("%d", &num1);

	hour = num1 / 3600;
	min = (num1%3600) / 60;
	sec = ((num1 % 3600) % 60) / 1;

	printf("%d hour, %d min, %d sec", hour, min ,sec);
	return 0;
}*/
/*int main()
{
	int num1 = 0;
	int a = 1, i = 1;
	scanf("%d", &num1);
	for (int i = 0; ; i++)
	{
		a *= 2;
		if (num1/a >= 1 && num1/a < 2)
		{
			printf("%d", i+1);
			break;
		}
		else 
			continue;
	}
	return 0;
}*/
/*int jegob(num1);
int main()
{
	int num1 = 0;
	scanf("%d", &num1);
	printf("%d", jegob(num1));
	return 0;
}
int jegob(int n)
{	
	if (n == 0)
		return 1;
	else
	{
		return 2 * jegob(n - 1);
	}
}*/