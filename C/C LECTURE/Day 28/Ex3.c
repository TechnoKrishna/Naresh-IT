#include<stdio.h>
#include<conio.h>

int main()
{
    int a=0, b=5, c;

    c = a++ && --b;

    printf("a=%d, b=%d, c=%d", a, b, c);

    return 0;
}