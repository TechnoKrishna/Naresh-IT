#include <stdio.h>
#include <conio.h>

int main()
{

    int a, b, c;

    printf("Enter a, b, c values ");
    scanf("%d %d %d", &a, &b, &c);

    if (a == b && a == c)
        puts("All are equal");
    else if (a > b && a > c)
        puts("a is big");
    else if (b > c)
        puts("b is big");
    else
        puts("c is big");

    return 0;
}