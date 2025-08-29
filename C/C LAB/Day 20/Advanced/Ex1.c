#include <stdio.h>
#include <conio.h>
#include <math.h>

int main()
{

    int no;
    int temp;
    int sqr;
    int digit;
    int sum = 0;
    int smp = 1;

    printf("Enter a No : ");
    scanf("%d", &no);

    sqr = no * no;

    temp = sqr;

    while (temp != 0)
    {
        digit++;
        temp /= 10;
    }

    temp = sqr;

    int i = 1;

    if (digit > 2)
    {
        smp = 100;
    }
    else
    {
        smp = 10;
    }

    while (temp != 0)
    {
        sum = sum + temp % smp;
        temp /= smp;
    }

    // printf("\n%d %d %d", sqr, digit, sum);

    if (no == sum)
    {
        printf("Kaprekar");
    }
    else
    {
        printf("Not Kaprekar");
    }

    return 0;
}