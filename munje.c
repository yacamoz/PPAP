#include <stdio.h>

int main()
{
    int num1;
    num1 = 1;
    scanf("%d", &num1);
    while (num1-1 >=0)
    {
        printf("hello world! %d \n", num1);
        num1--;
    }
    return 0;
}