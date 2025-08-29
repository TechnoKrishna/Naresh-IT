#include <stdio.h>
#include <conio.h>

int main()
{
    int n, r, c;

    printf("Enter how many rows ");
    scanf("%d", &n);

    for (r = n; r >= 1; r--)
    {
        for (c = 1; c <= r; c++)
        {
            printf("%3d", c);
        }
        printf("\n");
    }
    return 0;
}