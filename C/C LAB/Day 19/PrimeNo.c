#include <stdio.h>

int main()
{
    int no, flag = 0;
    scanf("%d", &no);

    if (no <= 1)
    {
        printf("Invalid input. Enter a positive integer.");
        return 0;
    }

    for (int i = 2; i <= no / 2; i++)
    {
        if (no % i == 0)
        {
            flag = 1;
            break;
        }
    }

    if (flag == 0)
        printf("%d is a prime number.", no);
    else
        printf("%d is not a prime number.", no);

    return 0;
}
