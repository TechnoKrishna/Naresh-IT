#include <stdio.h>
#include <conio.h>

int main()
{

    int n, s;

    printf("Enter n Value ");
    scanf("%d", &n);

    s = n * (n + 1)/2;

    printf("Sum=%d, Avg=%.2f", s, (float)s / n); // Explicit Type Casting

    return 0;
}