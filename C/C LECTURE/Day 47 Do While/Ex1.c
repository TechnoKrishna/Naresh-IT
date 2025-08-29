#include <stdio.h>
#include <conio.h>

int main()
{

    int a, b, i = 1, gcd;

    printf("Enter a, b values : ");
    scanf("%d %d", &a, &b);

    while (i <= a && i <= b)
    {
    if (a % i == 0 && b % i == 0)
    gcd = i;
    i++;
    }

    printf("\nGcd = %d", gcd);

    printf("\nLcm = %d", a*b/gcd);

    return 0;
}