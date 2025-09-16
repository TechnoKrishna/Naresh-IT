#include <stdio.h>
#include <conio.h>

int main()
{

    int a, b, next;

    a = 0;
    b = 1;

    for (int i = 1; i <= 5; i++)
    {

        for (int j = 1; j <= 5; j++)
        {
            if (i == 1 || i == j || j > i-1)
            {
                printf("%4d", a);
                next = a + b;
                a = b;
                b = next;
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
