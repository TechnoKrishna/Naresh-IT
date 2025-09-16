#include <stdio.h>
#include <conio.h>

int main()
{

    for (int i = 1; i <= 4; i++)
    {
        for (int j = 1; j <= 5; j++)
        {
            if (j < 6 - i)
            {
                printf("%2c", ' ');
            }
            else
            {
                printf("%2d", 6 - j);
            }
        }
        printf("\n");
    }

    for (int i = 1; i <= 5; i++)
    {
        for (int j = 5; j > 0; j--)
        {
            if (j < 7 - i)
            {
                printf("%2d", j);
            }
            else
            {
                printf("%2c", ' ');
            }
        }
        printf("\n");
    }

    return 0;
}