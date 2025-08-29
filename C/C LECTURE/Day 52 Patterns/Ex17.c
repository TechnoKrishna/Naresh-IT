#include <stdio.h>
#include <conio.h>

int main()
{
    int n, r, c, s;

    printf("Enter how many rows ");
    scanf("%d", &n);

    for (r = 1; r <= n; r++)
    {
        for (s = 1; s <= n - r; s++)
            printf(" ");
        for (c = 1; c <= r; c++)
            printf("* ");
        printf("\n");
    }
    return 0;
}