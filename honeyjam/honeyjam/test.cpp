#include <stdio.h>
#pragma warning(disable:4996)
int main()
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
}
/*int main()
{
    int a, b;
    a = 1;
    b = 1;
    do
    {
        b = 1;
        do
        {
            b++;
            printf("%dx%d=%d\n", a, b, a * b);
        } while (b < 9);


    } while (a++ < 9);

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

    for (int i = n; i > 0;i=i-2)
    {
        total *= i;

    }

    printf("값은: %d", total);
    return 0;
}*/
/*int main()
{
    int num1, num2, total, i, i2;
    num1, num2, total = 0;

    printf("두개의 값을 입력해주세요")
    scanf("")
    for (i = 0; i < length; i++)
    {
        for (i2 = 0; i2 < num1; i++)
        {
            printf("%dx", num2);
        }
    }
}*/