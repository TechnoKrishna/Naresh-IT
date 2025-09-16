#include <stdio.h>
#include <conio.h>

int main()
{

    for (int i = 1; i <= 5; i++)
    {
        for (int j = 64 + i; j <= 68 + i; j++)
        {
            printf("%4c", j);
        }
        printf("\n");
    }

    return 0;
}
