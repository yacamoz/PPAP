#include <stdio.h>

int main()
{
    int a = 1, b = 1;
    while (a++<10)
    {
        b = 1;
        while (b++<10)
        {
            printf("%2dx%d=%3d ", a, b, a*b);
            
        }
        printf("\n");
        
    }
    return 0;
}