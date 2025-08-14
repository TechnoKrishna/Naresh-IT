#include <stdio.h>

int main()
{
    int u;

    scanf("%d", &u);

    (u < 2) ? printf("Plan A - RS. 199") : (u >= 2 && u < 10) ? printf("Plan B - RS. 399") : (u >= 10) ? printf("Plan C - RS. 599") : printf("Invalid");

    return 0;
}