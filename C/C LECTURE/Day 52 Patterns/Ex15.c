#include <stdio.h>
#include <conio.h>

int main()
{
    int n, r, c, a;

    printf("Enter how many rows ");
    scanf("%d", &n);

    a = n*(n+1)/2;

    for (r = 1; r <= n; r++)
    {
        for (c = 1; c <= r; c++)
        {
            printf("%3d", a--);
        }
        printf("\n");
    }
    return 0;
}