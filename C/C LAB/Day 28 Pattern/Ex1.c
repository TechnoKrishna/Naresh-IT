#include <stdio.h>
#include <conio.h>

int main() {

    for (int i = 1; i <= 5; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            printf("%2d", j);
        }
        printf("\n");
    }

    for (int i = 1; i <= 4; i++)
    {
        for(int j = 1; j <= 5-i; j++)
        {
            printf("%2d", j);
        }
        printf("\n");
    }
    

    return 0;
}