#include <stdio.h>
int main()
{
    int a = 4;
    int b = 2;
    int c = 3;
    if (a*c > 10)
        printf("%d %d %d\n", a+b, b*c, c);
    else if (a*c < 10)
        printf("GURA\n");
    return 0;
}