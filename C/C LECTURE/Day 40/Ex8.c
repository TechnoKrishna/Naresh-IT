#include <stdio.h>
#include <conio.h>
int main()
{
    int n;
    printf("Enter a no ");
    scanf("%d", &n);

    if (n % 2 == 0)
        puts("Even");
    else
        puts("Odd");
    if (n % 2)
        puts("Odd");
    else
        puts("Even");


    if((n&1)==0) puts("Even"); else puts("Odd");
    

    return 0;
}