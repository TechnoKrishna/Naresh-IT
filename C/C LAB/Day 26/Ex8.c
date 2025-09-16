#include <stdio.h>
#include <conio.h>

int main() {

    for(int i = 1; i <= 5; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            printf("%4d", 2*j);
        }
        printf("\n");
    }



    return 0;
}