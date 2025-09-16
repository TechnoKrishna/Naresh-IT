#include <stdio.h>
#include <conio.h>

int main()
{

    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= 5; j++)
        {
            if (i == 5)
            {
                printf("%4d", i);
            }
            else if (j == 5)
            {
                printf("%4d", j);
            }
            else if (i == 4)
            {
                printf("%4d", i);
            }
            else if (j == 4)
            {
                printf("%4d", j);
            }
            else if (i == 3)
            {
                printf("%4d", i);
            }
            else if (j == 3)
            {
                printf("%4d", j);
            }
            else if (i == 2)
            {
                printf("%4d", i);
            }
            else if (j == 2)
            {
                printf("%4d", j);
            }
            else if (i == 1 || i == j)
            {
                printf("%4d", j);
            }
            else
            {
                printf("%4c", ' ');
            }
        }
        printf("\n");
    }

    return 0;
}