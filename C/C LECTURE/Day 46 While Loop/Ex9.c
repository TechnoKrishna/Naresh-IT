#include <stdio.h>
#include <conio.h>

int main()
{

    int n;
    long f = 1;

    printf("Enter n Value ");
    scanf("%d", &n);

    while (n > 1) f = f * n--;

    printf("Factotial=%ld", f);

    return 0;
}