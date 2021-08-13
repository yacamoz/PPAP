#include <stdio.h>

int main()
{
    int a, b;
    a = 1;
    b = 1;
    do
    {   
        b=1;
        do
        {
            b++;
            printf("%dx%d=%d\n", a, b, a*b);
        } while (b < 9);
    
        
    } while (a++ < 9);
    
}