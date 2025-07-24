// Find even/odd without using if.else / ternary operator?

#include<stdio.h>
#include<conio.h>

int main()
{
    int n;

    printf("Enter N Value");
    scanf("%d", &n);

    printf("\n NORMAL : ");

    n%2==0 && printf("EVEN");
    n%2!=0 && printf("ODD");

    printf("\n SHORT HAND : ");

    n%2==0 && printf("EVEN") || printf("ODD");

    return 0;
}