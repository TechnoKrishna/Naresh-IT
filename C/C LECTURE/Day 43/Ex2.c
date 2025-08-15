#include <stdio.h>
#include <conio.h>
int main()
{
    int pin, count = 0;
abc:
    printf("Enter 4 digit pin number ");
    scanf("%4d", &pin);
    if (pin == 1234)
        puts("Welcome to HDFC ATM");
    else
    {
        count++;
        if (count == 3)
            puts("Ur card blocked for 24-hours");
        else
        {
            puts("Invalid PIN");
            goto abc;
        }
    }

    return 0;
}