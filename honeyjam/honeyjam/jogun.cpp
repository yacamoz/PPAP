#include <stdio.h>
#pragma warning(disable:4996)

/*int main()
{
	int num;
	printf("���� �Է�:");
	scanf("%d", &num);

	if (num < 0)
		printf("�Է� ���� 0���� �۴�\n");
	if (num == 3)
		printf("3�̳׿�\n");
	if (num > 0)
		printf("�Է� ���� 0���� ũ��\n");
	if (num == 0)
		printf("�Է� ���� 0�� ����\n");

	return 0;
}*/
/*int main()
{
	int opt;
	double num1, num2;
	double result;
	
	printf("1.���� 2.���� 3.���� �׿�.������ \n");
	printf("����?");
	scanf("%d", &opt);
	printf("�� ���� �Ǽ� �Է�");
	scanf("%lf %lf", &num1, &num2);

	if (opt == 1)
		result = num1 + num2;
	else if (opt == 2)
		result = num1 - num2;
	else if (opt == 3)
		result = num1 * num2;
	else 
		result = num1 / num2;

	printf("��� %f \n", result);
	return 0;
}*/
 /*int main()
{
	int num;
	printf("3 OR 4: ");
	scanf("%d", &num);
	for (int i = 1; i*num < 100; i++)
	{
		if (num % 3 == 0 || num % 4 == 0)
		{
			printf("3�Ǵ� 4�� ���: %d\n", i*num);
			
		}
	}
	return 0;
}*/
/*int main()
{
	int num;
	printf("enter number");
	scanf("%d", &num);
	if (num < 0)
		printf("Low than 0\n");
	else
		printf("0������ ���� ����");

	return 0;

}*/
/*int main()
{
	int num, abs;
	printf("���� �Է�: ");
	scanf("%d", &num);

	abs = num > 0 ? num : num * (-1);
	printf("���� ��: %d", abs);
	return 0;
}*/
/*int main()
{
	int num1 = 0, num2 = 0;
	printf("���� �Է�: ");
	scanf("%d %d", &num1, &num2);
	
	if (num1 > num2)
		printf("���: %d", num1 - num2);
	else if (num1 < num2)
		printf("���: %d", num2 - num1);
	return 0;
}*/
/*int main()
{
	int a, b, c, d;
	printf("������ ���� ������� �Է�");
	scanf("%d %d %d", &a, &b, &c);
	d = (a + b + c)/3;
	if (d >= 90)
		printf("�Ϳ� A����");
	else if (d >= 80)
		printf("���̰� B����");
	else if (d >= 70)
		printf("���� C����");
	else if (d >= 50)
		printf("���߾�� D");
	else
		printf("�а�");
	
	return 0;
}*/
/*int main()
{
	int sum = 0, num = 0;
	while (1)
	{
		sum += num;
		if (sum > 5000)
			break;
		num++;
	}
	printf("sum: %d\nnum: %d", sum, num);
	return 0;
}*/
/*int main()
{
	int num; 
	printf("start");
	
	for (num = 1; num < 20; num++)
	{
		if (num % 2 == 0 || num % 3 == 0)
			continue;
		printf("%d ", num);
	}

		return 0;

}*/
/*int main()
{
	int num;
	double num1, num2;
	num1 = 5.0;
	num2 = 1.75;
	num1 /= num2;
	printf("��� %f", num1);
	printf("1�̻� 5������ ���� �Է�:");
	scanf("%d", &num);

	switch (num)
	{
	case 1:
			printf("1�� one\n");
			break;
	case 2:
			printf("2�� two\n");
			break;
	case 3:
			printf("3�� three\n");
			break;
	case 4:
			printf("4�� four\n");
			break;
	case 5:
			printf("5�� five\n");
			break;
	default:
		printf("I don't know!\n");
	}
	return 0;
}*/
/*int main()
{
	int ID, PW, myID, myPW;
	ID = 777;
	PW = 8217;
	myID = 0, myPW = 0;
	
	while(1)
	{
		printf("���̵� �Է��ϼ���: ");
		scanf("%d", &myID);
		printf("�н����带 �Է��ϼ���: ");
		scanf("%d", &myPW);
		if (myID == ID && myPW == PW)
		{
			printf("Acess");
			break;
		}
		else if (myID == ID && myPW != PW)
		{
			printf("�н����带 Ȯ���ϼ���\n\n");
			continue;
		}
		else if (myID != ID && myPW == PW)
		{
			printf("���̵� Ȯ���ϼ���\n\n");
			continue;
		}
		else
		{	
			printf("�Ѵ� Ȯ�����ּ���\n\n");
			continue;
		}
	}
	return 0;
}*/