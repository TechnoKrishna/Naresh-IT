#include <stdio.h>
#include <conio.h>

int main() {

    for(int j = 1; j < 5; j++)
    {
        for(int i = 5; i > 0; i--)
        {
            printf("%2d", i);
        }
        printf("\n");
    }


    return 0;
}