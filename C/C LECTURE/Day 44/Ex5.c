#include <stdio.h>
#include <conio.h>
int main()
{
    int n;
    printf("Enter a no ");
    scanf("%d", &n);
    switch(n % 2)
    {
        case 0 : puts("Even"); break;
        default: puts("Odd");
    }
}