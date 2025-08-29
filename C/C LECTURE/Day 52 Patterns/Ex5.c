#include <stdio.h>
#include <conio.h>

int main()
{
    int nr, nc, r, c;
    printf("Enter how many rows and columns ");
    scanf("%d%d", &nr, &nc);
    for (r = 1; r <= nr; r++)
    {
        char U = 'A', L = 'a';
        for (c = 1; c <= nc; c++)
        {
            if (c % 2 == 0)
                printf("%c", L++);
            else
                printf("%c", U++);
        }
        printf("\n");
    }

    return 0;
}