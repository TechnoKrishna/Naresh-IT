#include <stdio.h>
#include <conio.h>

int main()
{
    long m, n, rev = 0;
    printf("Enter a no ");
    scanf("%ld", &n);
    if (n < 0)
        printf("-", n = -n);
    m = n;
    while (m != 0)
    {
        int
            r = m % 10;
        rev = rev * 10 + r;
        m /= 10;
    }
    do
    {
        switch (rev % 10)
        {
        case 0:
            printf("Zero");
            break;
        case 1:
            printf("One");
            break;
        case 2:
            printf("Two");
            break;
        case 3:
            printf("Three");
            break;

        case 4:
            printf("Four");
            break;
        case 5:
            printf("Five");
            break;
        case 6:
            printf("Six");
            break;
        case 7:
            printf("Seven");
            break;
        case 8:
            printf("Eight");
            break;
        case 9:
            printf("Nine");
            break;
        }
        rev = rev / 10;
        printf(" ");
    } while (rev != 0);
    while (n % 10 == 0 && n != 0)
        printf("Zero ", n /= 10);

    return 0;
}