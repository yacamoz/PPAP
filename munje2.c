#include <stdio.h>

int main()
{
    int num1, num2;
    num1, num2 = 1;
    scanf("%d", &num1);
    while (num2 <= num1)
    {
        printf("%d ", num2*3);
        num2++;
    }
    return 0;
}