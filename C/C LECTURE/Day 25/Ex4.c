#include<stdio.h>
#include<conio.h>

int main()
{
    int a = 20;

    a = a++ / 2;

    printf("a=%d\n", a);

    a = ++a / 2;

    printf("a=%d\n", a);

    return 0;

}