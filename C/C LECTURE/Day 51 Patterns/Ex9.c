#include <stdio.h>
#include <conio.h>

int main()
{
    int nr, nc, r, c, a = 1;
    printf("Enter how many rows and columns ");
    scanf("%d%d", &nr, &nc);
    for (r = 1; r <= nr; r++)
    {
        a = nc;
        for (c = 1; c <= nc; c++)
        {
            if (r % 2 == 0)
                printf("%3d", a--);
            else
                printf("%3d", c);
        }
        printf("\n");
    }

    return 0;
}