#include <stdio.h>
#include <conio.h>

int main()
{
    int m;
    printf("Enter month no : ");
    scanf("%d", &m);

    if(m==1 || m==3 || m==5 || m==8 || m==10 || m==12 || m==7) puts("31 Days");
    else if(m==2) puts("28/29 days");
    else if(m==4 || m==6 ||m==9 || m==11) puts("30 days");
    else puts("Invalid Month...");

    return 0;
}