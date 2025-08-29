#include <stdio.h>
#include <conio.h>

int main()
{
    int n, r, c;

    printf("Enter how many rows ");
    scanf("%d", &n);

    for (r = 1; r <= n; r++)
    {
        for (c = 1; c <= r; c++)
        {
            if ((r + c) % 2 == 0)
                printf("$ ");
            else
                printf("* ");
        }
        printf("\n");
    }
    return 0;
}