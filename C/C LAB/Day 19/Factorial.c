#include <stdio.h>

int main()
{
    int no;
    int f = 1;

    scanf("%d", &no);

    if (no < 0)
    {
        printf("Invalid input Please enter a positive integer.");
    }
    else
    {

        for (int i = 1; i <= no; i++)
        {
            f = f * i;
        }

        printf("Factorial of %d = %d", no, f);
    }
}