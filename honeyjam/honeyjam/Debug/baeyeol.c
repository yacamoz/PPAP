#include <stdio.h>
#pragma warning(disable:4996)

/*int main()
{
	int arr[3] = { 1, 2, 3 };
	int sum = 0, i = 0;

	for (i = 0; i < 3; i++)
	{
		 scanf("%d", &arr[i]);
		sum += arr[i];
	}
	for (i = 0; i < 3; i++)
		printf("arr%d�� �� ���ڴ� %d", i, arr[i]);

	printf("�迭 ��ҿ� ����� ���� ��: %d", sum);
	return 0;
}*/
/*int main()
{
	int arr1[5] = { 1, 2, 3, 4, 5 };
	int arr2[] = { 1,2,3,4,5,6,7 };
	int arr3[5] = { 1, 2 };
	int ar1len, ar2len, ar3len, i;
	printf("�迭 arr1: %d \n", sizeof(arr1));
	printf("�迭 arr1: %d \n", sizeof(arr2));
	printf("�迭 arr1: %d \n", sizeof(arr3));

	ar1len = sizeof(arr1) / sizeof(int);
	ar2len = sizeof(arr2) / sizeof(int);
	ar3len = sizeof(arr3) / sizeof(int);

	for (i = 0; i < ar1len; i++)
		printf("%d", arr1[i]);
	printf("\n");

	for (i = 0; i < ar2len; i++)
		printf("%d", arr2[i]);
	printf("\n");
	
	for (i = 0; i < ar3len; i++)
		printf("%d", arr3[i]);
	printf("\n");

	return 0;

}*/
/*int main()
{
	int arr[5];
	int i = 0, max = 0, min = 0, sum = 0;

	for (int i = 0; i < 5; i++)
	{
		printf("�Է���: ");
		scanf("%d", &arr[i]);

	}
	
	for (int i = 0; i < 5; i++)
	{
		if (arr[i] > max)
			max = arr[i];
		if (arr[i] < min)
			min = arr[i];
	}

	printf("�ִ�: %d, �ּҰ�: %d, ���� ��: %d", max, min, max + min);
	return 0;

}*/
/*int main()
{
	int strlen;
	char str[] = { 'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'i', 'n', 'g' };
	strlen = sizeof(str) / sizeof(char);

	for (int i = 0; i < strlen; i++)
		printf("%c", str[i]);
	printf("\n");

	return 0;
}*/
/*int main()
{
	char str[] = "good morning!";
	printf("str sizeof %d", sizeof(str));
	printf("str null %c", str[13]);
	printf("str numm %d", str[13]);

	str[12] = '?';
	printf("���ڿ� ��� %s \n", str);
	return 0;
}*/
/*int main()
{
	char str[50];
	int idx = 0;

	printf("���ڿ� �Է�: ");
	scanf("%s", str);
	printf("�Է� ���� ���ڿ�: ");
	while(str[idx] != '\0')
	{
		printf("%c", str[idx]);
			idx++;
	}
	printf("\n");
	return 0;
}*/
/*int main()
{
	char str[50] = "I like c programming";
	printf("string: %s\n", str);

	str[8] = " \0";
	printf("string: %s \n", str);
	str[6] = " \9";
	printf("string: %s \n", str);
	str[1] = " \0";
	printf("string: %s \n", str);

		for (i = len; i<0; i--)
	{
		printf("%s", str[len]);
	}

	return 0;
}*/
/*int main()
{
	char str[50];
	int len = 0, i = 0;
	scanf("%s", str);
	while (str[len]!='\0')
	{
		len++;
	}

	for (i = len; i > 0; i--)
	{
		printf("%c", str[i-1]);
	}
	printf("length: %d \n", len);
	printf("%c", str[3]);

	return 0;
}*/
/*int main()
{
	char str[50];
	char code = 0;
	int len = 0, i = 0;
	scanf("%s", &str);

	while (str[len] != '\0')
	{
		len++;
	}
	for (i = 0; i < len; i++)
	{
		if (str[i] > code)
			code = str[i];

	}
	printf("highest: %c", code);
}*/