#include <stdio.h>

int main()
{
    int dan = 0, num = 1;
    printf("몇 단?");
    scanf("%d %d", &dan, &num);
    while (num<10, dan<10)
    {
        printf("%dx%d=%d\n", dan, num, dan*num);
        num++;
        dan++;
    }
    return 0;
}