#include <stdio.h>
#include <conio.h>

int main()
{
    int t = 1;

    for (int i = 1; i <= 5; i++)
    {
        for(int j = 1; j < 1+i; j++)
        {
            printf("%4d", t++);
        }
        printf("\n");
    }

    return 0;
}