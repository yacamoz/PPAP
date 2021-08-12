#include <stdio.h>
int main()
{
    int result;
    int n1, n2, n3;

    printf("enter the number:");
    scanf("%d %d %d", &n1, &n2, &n3);

    result = n1+n2+n3;
    printf("%d+%d+%d=%d", n1, n2, n3, result);
    
    return 0;
}