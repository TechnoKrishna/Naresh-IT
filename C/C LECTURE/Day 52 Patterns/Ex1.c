#include <stdio.h>
#include <conio.h>

int main()
{
    int nr, nc, r, c, a;
    printf("Enter how many rows and columns ");
    scanf("%d%d", &nr, &nc);
    for (r = 1; r <= nr; r++)
    {
        for (c = 1; c <= nc; c++)
        {
            if(r%2==0)printf("%2c", 96+c);
            else printf("%2c", 64+c);
        }
        printf("\n");
    }

    return 0;
}