#include <stdio.h>
#include <conio.h>

int main()
{
    int nr, nc, r, c;
    char ch = 'A';
    printf("Enter how many rows and columns ");
    scanf("%d%d", &nr, &nc);
    for (r = 1; r <= nr; r++)
    {
        for (c = 1; c <= nc; c++)
        {
            if (r == 1 || c == 1 || r == nr || c == nc)
                printf("* ");
            else
                printf("%c ", ch++);
            if (ch > 'Z')
                ch = 'A';
        }
        printf("\n");
    }

    return 0;
}