#include <stdio.h>
#pragma warning(disable:4996)
/*int main()
{
    int i, total;
    total = 0;
    i = 0;
    do{
        total += i;
        i = i + 2;

    }while(i <= 100);
    
    printf("합계는 %d", total);
    return 0;
}*/
/*int main()
{
    int a=1, b=1;
    do
    {
        b = 0;
        do
        {
            b++;
            printf("%2dx%d=%3d ", a, b, a * b);
        } while (b < 9);

        printf("\n");

    } while (a++ < 9);
    return 0;
}*/
/*int main()
{
    int total = 0;
    int i, num;
    printf("0 to num Plus, Enter num:");
    scanf("%d", &num);

    for (i = 0; i <= num; i++)
        total += i;

    printf("\n0 to %d plus answer:%d", num, total);
    return 0;
}*/
/*int main()
{
    int n, i, total;
    n, i, total = 1;
    printf("숫자를 입력하세요:");
    scanf("%d", &n);

    for (int i = n; i > 0;i=i--)
    {
        total *= i;

    }

    printf("값은: %d", total);
    return 0;
}*/
/*int main()
{//for문 문제1번
    int num1, num2, total, i, i2;
    total = 0;
    num1 = 0;
    num2 = 0;
    i = 0;

    printf("두개의 값을 입력해주세요:");
    scanf("%d %d", &num1, &num2);
    printf("%d", num1);
    total = num1;
   
   for (num1+=1; num1 <= num2; num1++)
        {
           printf("+%d", num1);
           total += num1;
        }

    printf("=%d", total);
    return 0;
}*/
/*int main()
{
    int a = 1, b = 1;
    for(; a < 10; a++)
    {
        b = 1;
        for (; b < 10; b++)
        {
            printf("%2dx%d=%3d ", a, b, a * b);
        }
        printf("\n");

    }
    return 0;
}*/
int main()
{
    int a = 0, b = 0;
    while (a++ < 9)
    {
        b = 0;
        while (b++ < 9)
        {
            printf("%2dx%d=%3d ", a, b, a * b);

        }
        printf("\n");

    }
    return 0;
}