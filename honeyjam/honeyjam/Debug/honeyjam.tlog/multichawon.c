#include <stdio.h>
#pragma warning(disable:4996)

/*int main()
{
	int arr1[3][4];
	int arr2[7][9];

	printf("arr1의 길이는 %d \n", sizeof arr1 / sizeof(int));
	printf("arr1의 길이는 %d \n", sizeof arr2 / sizeof(int));
}*/
/*int main()
{
	int villa[4][2];
	int popu, i, j;

	for (i = 0; i < 4; i++)
	{
		for (j = 0; j < 2; j++)
		{
			printf("%d 층 %d 호 인구수:", i + 1, j + 1);
			scanf("%d", &villa[i][j]);
		}
	}

	for (i = 0; i < 4; i++)
	{
		popu = 0;
		popu += villa[i][0];
		popu += villa[i][1];
		printf("%d층 인구수: %d\n", i + 1, popu);
	}
	return 0;
}*/
/*int main()
{
	int arr[3][2];
	int i, j;
	for(i = 0; i<3; i++)
		for (j = 0; j < 2; j++)
		{
			printf("%p \n", &arr[i][j]);

		}
	return 0;
}*/
/*int main()
{
	int i, j;
	int arr1[3][3] = {
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9}
	};
	int arr2[3][3] = {
		{1},
		{4, 5},
		{7, 8, 9}
	};
	int arr3[3][3] = { 1, 2, 3, 4, 5, 6, 7 };
	for (i = 0; i < 3; i++)
	{
		for (j = 0; j < 3; j++)
			printf("%d", arr1[i][j]);
		
		printf("\n");
	}
	for (i = 0; i < 3; i++)
	{
		for (j = 0; j < 3; j++)
			printf("%d", arr2[i][j]);

		printf("\n");
	}
	for (i = 0; i < 3; i++)
	{
		for (j = 0; j < 3; j++)
			printf("%d", arr3[i][j]);

		printf("\n");
	}
	return 0;
}*/
/*int main()
{
	int gugu[3][9];
	int i, j;
	for (i = 0; i < 3; i++)
	{
		for (j = 0; j < 9; j++)
		{
			gugu[i][j] = (i+2) * (j+1);
			printf("%d ", gugu[i][j]);
		}
		printf("\n");
	}
	return 0;
}*/
/*int main()
{
	int i, j, k = 1;
	int arr1[2][4], arr2[4][2];
	for (i = 0; i < 2; i++)
	{
		for (j = 0; j < 4; j++)
		{
			arr1[i][j] = k++;
			printf("%d", arr1[i][j]);
		}
		printf("\n");
	}
	for (i = 0; i < 4; i++)
	{
		for (j = 0; j < 2; j++)
		{
			arr2[i][j] = arr1[j][i];
			printf("%d", arr2[i][j]);
		}
		printf("\n");
	}

	return 0;
}*/
/*int main()
{
	int test[5][5];
	int i, j, hang = 0, yeol = 0;
	for (i = 0; i < 4; i++)
	{
		hang = 0, yeol = 0;
		for (j = 0; j < 4; j++)
		{
			scanf("%d", &test[i][j]);
		}
	}
	for (i = 0; i < 4; i++)
	{
		hang = 0;
		for (j = 0; j < 4; j++)
		{
			hang += test[i][j];
			test[i][4] = hang;

		}
	}
	for (i = 0; i < 5; i++)
	{
		yeol = 0;
		for (j = 0; j < 4; j++)
		{
			yeol = yeol + test[j][i];
			test[4][i] = yeol;
		}
	}
	for (i = 0; i < 5; i++)
	{
		for (j = 0; j < 5; j++)
		{
			printf("%3d ", test[i][j]);
		}
		printf("\n");
	}

	return 0;
}*/