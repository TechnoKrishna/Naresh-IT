#include <stdio.h>
#include <conio.h>

int main()
{

    int c = 1;

    for (int i = 1; i <= 9; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            if (i >= 6)
            {
                if (j < 11 - i)
                {
                    printf("%4d", j);
                }
                else
                {
                    printf("%4c", ' ');
                }
            }
            else if (i >= 1 && i <= 5)
            {
                printf("%4d", j);
            }
            else
            {
                printf("%4c", ' ');
            }
        }
        c += 1;
        printf("\n");
    }

    return 0;
}