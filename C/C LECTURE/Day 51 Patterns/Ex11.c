#include <stdio.h>
#include <conio.h>

int main()
{
    int nr, nc, r, c, a;
    printf("Enter how many rows and columns ");
    scanf("%d%d", &nr, &nc);
    for (r = 1; r <= nr; r++)
    {
        a = r;
        for (c = 1; c <= nc; c++)
        {
            printf("%2c", 64+c);
        }
        printf("\n");
    }

    return 0;
}