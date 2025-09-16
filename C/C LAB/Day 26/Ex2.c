#include <stdio.h>
#include <conio.h>

int main() {

    for(int i = 1; i <= 5; i++)
    {
        for(int j = 1; j <= 4; j++)
        {
            printf("%4d", (5*(j-1)) + i);
        }
        printf("\n");
    }


    return 0;
}