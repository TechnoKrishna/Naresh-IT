#include<stdio.h>
#include<conio.h>

int main()
{

    int a = 2, b;

    b = a++ + a++ + a++;

    printf("a=%d, b=%d\n", a, b);

    a= 2;

    b = ++a + ++a + ++a;

    printf("a=%d, b=%d\n", a, b);

    return 0;
}