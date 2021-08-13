#include <stdio.h>
int main()
{
int a, b, c, d;
a = 0;
b = 0;
char e = 'O';
while(a++ < 5)
{
    b = 1;
        while(b++ < a)
        {
        printf("%c", e);
        }
    printf("*\n");
}
    return 0;
}