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
            if (c <= nr - r)
                printf("%3d", 1);
            else
                printf("%3d", r);
        }
        printf("\n");
    }
}
