#include <stdio.h>
#include <conio.h>

int main()
{

    int n = 10;
    int count=0;
    int i, j, k;

    for (i = 1; i <= n; i++)
    {
        for (j = 0, k = 1; k <= i; k++)
        {
            if (i % k == 0)
                j++;
        }
        if (j == 2)
            printf("%4d", i, count++);
    }
    printf("\n%d primes", count);

    return 0;
}