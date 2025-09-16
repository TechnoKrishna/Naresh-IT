#include <stdio.h>
#include <conio.h>

int main()
{

    for (int i = 1; i <= 6; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            if (i == 1 || (i == 6) || (i == j))
            {
                printf("%4d", 1);
            }
            else
            {
                printf("%4d", j);
            }
        }
        printf("\n");
    }

    return 0;
}