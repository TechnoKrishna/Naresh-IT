#include <stdio.h>
#include <conio.h>

int main()
{
    int nr, r, c;

    printf("Enter how many rows ");
    scanf("%d", &nr);

    for (r = 1; r <= nr; r++)
    {
        for (c = 1; c <= nr; c++)
        {
            if (r == c)
                printf("1 ");
            else if (r > c)
                printf("2 ");
            else
                printf("0 ");
        }
        printf("\n");
    }
    return 0;
}
