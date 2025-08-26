#include <stdio.h>

int main()
{
    int n;

    scanf("%d", &n);

    if(!(n < 0))
    {
        int i = 1;
        printf("Odd numbers up to %d:", n);
        while(i <= n)
        {
            (i % 2 == 1) ? printf(" %d", i) : printf("");
            i++;
        }
    } else{
        printf("Invalid input. Program terminated.");
    }

    return 0;
}