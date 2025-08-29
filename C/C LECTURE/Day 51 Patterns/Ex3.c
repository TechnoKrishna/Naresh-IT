#include <stdio.h>
#include <conio.h>
int main()
{
    int a, n, i, c, count = 0;
    printf("Enter starting and ending values ");
    scanf("%d%d", &a, &n);
    if (a > n)
    {
        a = a + n;
        n = a - n;
        a = a - n;
    }
    for (; a <= n; a++)
    {
        for (c = 0, i = 1; i <= a; i++)
        {
            if (a % i == 0)
                c++;
        }
        if (c == 2)
            printf("%4d", a, count++);
    }
    printf("\n%d primes", count);
    return 0;
}