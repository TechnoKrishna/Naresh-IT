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
                printf("1 ");
            else
                printf("%d ", r);
        }
        printf("\n");
    }

    return 0;
}