// Find max in 2 no’s without using if..else /ternary op?

#include<stdio.h>
#include<conio.h>

int main()
{
    int a, b;

    printf("\nEnter Value of A & B : ");
    scanf("%d%d", &a, &b);

    // Normal 

    printf("\n NORMAL : ");

    a > b && puts("A is Greater");
    b > a && puts("B is Greater");
    a == b && puts("Both are Same");

    printf("\n SHORT HAND : ");

    a > b && printf("A is Greater") || printf("B is Greater");

    printf("\n MORE SHORT HAND : ");

    a > b && puts("A is Greater") || b > a && puts("B is Greater") || a == b && puts("Both are Equal");


    return 0;
}