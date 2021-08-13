#include <stdio.h>

int main()
{
    int myid, mypw;
    myid = 500;
    mypw = 1234;
    int id, pw;
    id, pw = 0;

         do
        {
            printf("enter the ID:");
            scanf("%d", &id);
            printf("enter the PW:");
            scanf("%d", &pw);
        
        } while (id != myid || pw != mypw);
        printf("Acess");
    return 0;
}