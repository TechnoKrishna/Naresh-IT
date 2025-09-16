#include <stdio.h>
#include <conio.h>

int main()
{

    int n = 5;

    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            if (i == 1 || i == 5 || j == 1 || j == 5)
            {
                printf("%4c", '*');
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