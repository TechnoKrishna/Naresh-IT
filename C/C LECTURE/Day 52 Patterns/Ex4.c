#include <stdio.h>
#include <conio.h>

int main()
{
    int nr, nc, r, c;
    char U = 'A', L = 'a';
    printf("Enter how many rows and columns ");
    scanf("%d%d", &nr, &nc);
    for (r = 1; r <= nr; r++)
    {
        for (c = 1; c <= nc; c++)
        {
            if (r % 2 == 0)
                printf("%2c", L);
            else
                printf("%2c", U);
        }
        printf("\n");
        if (r % 2 == 0)
            L++;
        else
            U++;
    }

    return 0;
}