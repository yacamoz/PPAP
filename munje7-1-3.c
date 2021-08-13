#include <stdio.h>

int main()
{
    int num1, num2;
    num1 = 0;
    num2 = 1;
    while (num2 > 0)
    {   
        scanf("%d ", &num2);
        num1 += num2;
        printf("%d \n", num1);
    }
    printf("this: %d", num1);
    return 0;
}