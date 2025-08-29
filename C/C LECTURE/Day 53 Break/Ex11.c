#include <stdio.h>
#include <conio.h>

int main()
{

    int i;
    
    for (i = 1; i <= 10; i++)
    {
        if (i == 2 || i == 7)
            continue;

        printf("%4d", i);
    }

    return 0;
}