#include<stdio.h>
#include<conio.h>

int main()
{
    int a = 4, b;
    
    b = a++;

    printf("a=%d, b=%d\n",a, b);

    a = 4;
    b = ++a;

    printf("a=%d, b=%d\n",a, b);

    return 0;
}