#include <stdio.h>
int main()
{
    int age = 4;
    int b = 2;
    int c = 3;
    if (b*c > 10)
        printf("%d %d %d\n", c+b, b*c, c);
    else if (b*c < 10)
        printf("GURA\n");
    return 0;
}