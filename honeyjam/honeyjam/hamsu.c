#include <stdio.h>
#pragma warning(disable:4996)

/*int main()
{
	int num1, num2;
	num1 = printf("12345\n");
	num2 = printf("I love my home\n");
	printf("%d %d \n", num1, num2);

	return 0;
}*/
/*double bokri(double wonguem, double eiz, double year)
{
	double total = 0;
	double eia = 1;
	for (int i = 1; i <= year; i++)
	{
		eia = eiz * eia;
	}
	total = wonguem * eia;
	printf("���� ���: %lf \n", total);
	return total;
}
int main()
{
	double num1 = 1, num2 = 1, num3 = 1;
	printf("����, ������, �� ���� ������ ���ÿ�: ");
	scanf_s("%lf %lf %lf", &num1, &num2, &num3);
	double result;
	result = bokri(num1, num2, num3);
	return 0;
}*/
/*int numbercompare(int num1, int num2);
int main()
{
	printf("3�� 4�߿��� ū ���� %d�̴�. \n", numbercompare(3, 4));
	printf("7�� 2�߿��� ū ���� %d�̴�. \n", numbercompare(7, 2));
	return 0;

}
int numbercompare(int num1, int num2)
{
	if (num1 > num2)
		return num1;
	else
		return num2;
}*/
/*double ftc(double fal);
double ctf(double cel);
int main()
{
	int tem = 0;
	double tem2 = 0;
	while (1)
	{
		printf("1.ȭ���� ������ 2.������ ȭ����: ");
		scanf("%d", &tem);
		printf("\n�� �� �ΰ���?: ");
		scanf("%lf", &tem2);
		if (tem == 1)
		{
			printf("\nȭ��%lf���� ������ %lf�� ", tem2, ftc(tem2));
			break;
		}
		else if (tem == 2)
		{
			printf("\n����%lf���� ȭ���� %lf��", tem2, ctf(tem2));
			break;
		}
		else
		{
			printf("�µ� ������ �ٽ� Ȯ���ϼ���.\n");
			continue;
		}
	}
	return 0;
}

double ftc(double fal)
{
	double cel = 1;
	cel = (fal - 32) / 1.8;
	return cel;
}
double ctf(double cel)
{
	double fal = 1;
	fal = 1.8*cel+32;
	return fal;
}*/
/*int asc(int num1, int num2);
int gav(int num);

int main()
{
	int num1, num2;
	printf("�� ���� ���� �Է�: ");
	scanf("%d %d", &num1, &num2);
	printf("%d�� %d�� ���밪�� ū ����: %d\ n", num1, num2, acs(num1, num2));
	return 0;

}

int asc(int num1, int num2)
{
	int con = 0;
	con = gav(num1) > gav(num2) ? num1 : num2;
	return con;

}

int gav(int num1)
{
	int con = 0;
	con = num1 < 0 ? (num1*(-1)) : num1;
	return con;
}*/
/*int pibo(int num);
int main()
{
	int num1 = 0;
	printf("������ �Է����ּ���: ");
	scanf("%d", &num1);
	pibo(num1);
	return 0;
}
int pibo(int num)
{
	int a = 0, b = 1;
	for (int i = 0; i <= num; i++)
	{
		printf("%d");
		a + b = c
	}
}*/
/*double calcul(double num1, char cul, double num2);
int main()
{
	double num1 = 1, num2 = 1, result = 1;
	char cal = 'a';
	scanf("%lf %c %lf", &num1, &cal, &num2);
	printf("%lf %c %lf =", num1, cal, num2);
	result = calcul(num1, cal, num2);
	while (1)
	{
		printf("%lf\n", result);
		scanf(" %c %lf", &cal, &num2);
		result = calcul(result, cal, num2);
		printf("=");
		if (cal == 'n')
			break;
		else
			continue;
	}
	printf("%lf", result);
	return 0;
}
double calcul(double num1, char cul, double num2)
{
	double result;
	if (cul == '+')
		result = num1 + num2;
	else if (cul == '-')
		result = num1 - num2;
	else if (cul == '*')
		result = num1 * num2;
	else if (cul == '/')
		result = num1 / num2;
	else
		result = num1;
	return result;
}*/
/*int spfone(void)
{
	int num = 20;
	num++;
	printf("simplefuncone num: %d \n", num);
	return 0;
}
int spftwo(void)
{
	int num1 = 20;
	int num2 = 30;
	num1++, num2--;
	printf("num1 & num2: %d %d \n", num1, num2);
	return 0;
}
int main()
{
	int num = 17;
	spfone();
	spftwo();
	printf("main num: %d \n", num);
	return 0;
}*/
/*int main()
{
	int cnt;
	for (cnt = 0; cnt < 3; cnt++)
	{
		int num = 0;
		num++;
		printf("%d��° �ݺ�, �������� num�� %d\n", cnt + 1, num);

	}
	if (cnt == 3)
	{
		int num = 7;
		num++;
		printf("if�� ���� �����ϴ� �������� num�� %d \n", num);
	}
	return 0;
}*/
/*int main()
{
	int num = 1;
	if (num == 1)
	{
		int num = 7;
		num += 10;
		printf("if�� �� �������� num: %d\n", num);

	}
	printf("main�Լ� �� ���� ���� num: %d\n", num);
	return 0;
}*/
/*void simplefunc(void)
{
	static int num1 = 0;
	int num2 = 0;
	num1++, num2++;
	printf("static: %d, local %d \n", num1, num2);

}

int main()
{
	int i;
	for (i = 0; i < 3; i++)
		simplefunc();
	return 0;
}*/
/*void recursive(int num)
{
	if (num <= 0)
		return;
	printf("recursive call! %d \n", num);
	recursive(num - 1);
}
int main()
{
	recursive(3);
	return 0;
}*/
/*int factorial(int n)
{
	if (n == 0)
		return 1;
	else
		return n * factorial(n - 1);
}
int main()
{
	printf("1! = %d\n", factorial(1));
	printf("4! = %d\n", factorial(4));
	printf("7! = %d\n", factorial(7));
	printf("10! = %d\n", factorial(10));
	return 0;
}*/
/*int main()
{
	int num = 0;
	scanf("%d", &num);
	printf("%x", num);
	return 0;
}*/
