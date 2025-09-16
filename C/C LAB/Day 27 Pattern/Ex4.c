#include <stdio.h>
#include <conio.h>

int main()
{

    int i, j;
    int a, b, next;

    for (i = 1; i <= 6; i++)
    {
        a = 0;
        b = 1;
        for (j = 1; j <= i; j++)
        {
            printf("%4d", a);
            next = a + b;
            a = b;
            b = next;

        }
        printf("\n");
    }

    return 0;
}