#include <stdio.h>
#include <conio.h>

int main()
{

    int a, b, max;

    printf("Enter a, b values : ");
    scanf("%d %d", &a, &b);

    max = a > b ? a : b;

    while (1)
    {
        if (max % a == 0 && max % b == 0)
        {
            printf("Lcm = %d", max);
            break;
        }
        max++;
    }

    return 0;
}