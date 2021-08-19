#include <stdio.h>
#pragma warning(disable:4996)

/*int main()
{
	int num;
	printf("정수 입력:");
	scanf("%d", &num);

	if (num < 0)
		printf("입력 값은 0보다 작다\n");
	if (num == 3)
		printf("3이네용\n");
	if (num > 0)
		printf("입력 값은 0보다 크다\n");
	if (num == 0)
		printf("입력 값은 0과 같다\n");

	return 0;
}*/
/*int main()
{
	int opt;
	double num1, num2;
	double result;
	
	printf("1.덧셈 2.뺄셈 3.곱셈 그외.나눗셈 \n");
	printf("선택?");
	scanf("%d", &opt);
	printf("두 개의 실수 입력");
	scanf("%lf %lf", &num1, &num2);

	if (opt == 1)
		result = num1 + num2;
	else if (opt == 2)
		result = num1 - num2;
	else if (opt == 3)
		result = num1 * num2;
	else 
		result = num1 / num2;

	printf("결과 %f \n", result);
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
			printf("3또는 4의 배수: %d\n", i*num);
			
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
		printf("0ㅇ보다 작지 않음");

	return 0;

}*/
/*int main()
{
	int num, abs;
	printf("정수 입력: ");
	scanf("%d", &num);

	abs = num > 0 ? num : num * (-1);
	printf("절대 값: %d", abs);
	return 0;
}*/
/*int main()
{
	int num1 = 0, num2 = 0;
	printf("정수 입력: ");
	scanf("%d %d", &num1, &num2);
	
	if (num1 > num2)
		printf("결과: %d", num1 - num2);
	else if (num1 < num2)
		printf("결과: %d", num2 - num1);
	return 0;
}*/
/*int main()
{
	int a, b, c, d;
	printf("국영수 점수 순서대로 입력");
	scanf("%d %d %d", &a, &b, &c);
	d = (a + b + c)/3;
	if (d >= 90)
		printf("와우 A에용");
	else if (d >= 80)
		printf("아이고 B에용");
	else if (d >= 70)
		printf("저런 C에용");
	else if (d >= 50)
		printf("망했어용 D");
	else
		printf("학고");
	
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
	printf("계산 %f", num1);
	printf("1이상 5이하의 정수 입력:");
	scanf("%d", &num);

	switch (num)
	{
	case 1:
			printf("1은 one\n");
			break;
	case 2:
			printf("2는 two\n");
			break;
	case 3:
			printf("3은 three\n");
			break;
	case 4:
			printf("4는 four\n");
			break;
	case 5:
			printf("5는 five\n");
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
		printf("아이디를 입력하세요: ");
		scanf("%d", &myID);
		printf("패스워드를 입력하세요: ");
		scanf("%d", &myPW);
		if (myID == ID && myPW == PW)
		{
			printf("Acess");
			break;
		}
		else if (myID == ID && myPW != PW)
		{
			printf("패스워드를 확인하세요\n\n");
			continue;
		}
		else if (myID != ID && myPW == PW)
		{
			printf("아이디를 확인하세요\n\n");
			continue;
		}
		else
		{	
			printf("둘다 확인해주세요\n\n");
			continue;
		}
	}
	return 0;
}*/