#include <stdio.h>
#include <conio.h>

int main()
{

    int n, r, c, s;

    printf("Enter how many rows ");
    scanf("%d", &n);

    for (r = n; r >= 1; r--)
    {
        for (s = 1; s <= n - r; s++)
            printf(" ");
        for (c = 1; c <= 2 * r - 1; c++)
            printf("*");
        printf("\n");
    }

    for (r = 2; r <= n; r++)
    {
        for (s = 1; s <= n - r; s++)
            printf(" ");
        for (c = 1; c <= 2 *r - 1; c++)
            printf("*");
        printf("\n");
    }

    return 0;
}
